package me.dingtou.web;

import com.alibaba.fastjson.JSON;
import me.dingtou.domain.FundOrder;
import me.dingtou.domain.dto.FundBuyInfo;
import me.dingtou.domain.dto.UserFundGroupData;
import me.dingtou.service.DataExportService;
import me.dingtou.service.DataImportService;
import me.dingtou.service.FundBaseService;
import me.dingtou.service.FundTradeService;
import me.dingtou.task.BuildTradeCalendarTask;
import me.dingtou.task.TradeOrderProcessTask;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.BASE64Decoder;

import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

/**
 * @author qiyan
 * @date 2017/6/18
 */
@Controller
public class ManagerController {
    @Autowired
    private FundBaseService fundBaseService;

    @Autowired
    private FundTradeService fundTradeService;

    @Autowired
    private BuildTradeCalendarTask buildTradeCalendarTask;

    @Autowired
    private TradeOrderProcessTask tradeOrderProcessTask;

    @Autowired
    private DataExportService dataExportService;

    @Autowired
    private DataImportService dataImportService;

    @RequestMapping(value = "/fundmanager.jsp", method = RequestMethod.GET)
    public
    @ResponseBody
    String fundManager(@RequestParam(value = "type", required = true) String type,
                       @RequestParam(value = "value", required = true) String value,
                       @RequestParam(value = "timestamp", required = false) String timestamp,
                       @RequestParam(value = "userId", required = true, defaultValue = "1") String userId) throws Exception {

        if (StringUtils.isBlank(value)) {
            return "param error.";
        }
        long userIdLong = Long.parseLong(userId);
        switch (type) {
            case "add":
                fundBaseService.addFundInfo(value);
                break;
            case "sync":
                fundBaseService.syncFundPrice(value, true);
                break;
            case "buy":
                String buyParam = new String(new BASE64Decoder().decodeBuffer(value), "utf-8");
                List<FundBuyInfo> buyInfoList = JSON.parseArray(buyParam, FundBuyInfo.class);
                Date createTime = new Date(Long.parseLong(timestamp));
                List<FundOrder> fundOrders = fundTradeService.createFundOrders(userIdLong, createTime, buyInfoList);
                return JSON.toJSONString(fundOrders);
            case "calendar":
                buildTradeCalendarTask.call();
                break;
            case "order":
                tradeOrderProcessTask.call();
                break;
            case "export":
                UserFundGroupData userFundGroupData = dataExportService.exportAll(userIdLong);
                String compress = userFundGroupData.compress();
                // return JSON.toJSONString(UserFundGroupData.uncompress(compress));
                // return JSON.toJSONString(userFundGroupData);
                return "http://127.0.0.1:8080/fundmanager.jsp?type=import&value=" + URLEncoder.encode(compress, "UTF-8");
            case "import":
                UserFundGroupData fundGroupData = UserFundGroupData.uncompress(value);
                UserFundGroupData importData = dataImportService.importData(fundGroupData);
                return JSON.toJSONString(importData);
            default:
                break;
        }
        return "done.";
    }


}
