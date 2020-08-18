package me.dingtou.service.impl;

import me.dingtou.domain.*;
import me.dingtou.domain.dto.UserFundGroupData;
import me.dingtou.mapper.*;
import me.dingtou.service.DataExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataExportServiceImpl implements DataExportService {
    @Autowired
    private FundInfoMapper fundInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserFundGroupMapper userFundGroupMapper;
    @Autowired
    private FundGroupDetailMapper fundGroupDetailMapper;
    @Autowired
    private FundOrderMapper fundOrderMapper;
    @Autowired
    private TradeCalendarMapper tradeCalendarMapper;

    @Override
    public UserFundGroupData exportAll(long userId) {

        UserFundGroupData userFundGroupData = new UserFundGroupData();

        // 基金明细
        FundInfoExample query = new FundInfoExample();
        List<FundInfo> fundInfoList = fundInfoMapper.selectByExample(query);
        userFundGroupData.setFundInfoList(fundInfoList);

        // 用户信息
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        userFundGroupData.setUserInfo(userInfo);

        // 基金组合
        UserFundGroupExample groupQuery = new UserFundGroupExample();
        groupQuery.createCriteria().andUserIdEqualTo(userId);
        List<UserFundGroup> userFundGroups = userFundGroupMapper.selectByExample(groupQuery);
        userFundGroupData.setUserFundGroupList(userFundGroups);


        if (!userFundGroups.isEmpty()) {
            // 基金组合明细
            FundGroupDetailExample detailQuery = new FundGroupDetailExample();
            List<Integer> fundGroupIds = userFundGroups.stream()
                    .map(e -> e.getFundGroupId())
                    .collect(Collectors.toList());
            detailQuery.createCriteria().andFundGroupIdIn(fundGroupIds);
            List<FundGroupDetail> fundGroupDetails = fundGroupDetailMapper.selectByExample(detailQuery);
            userFundGroupData.setFundGroupDetailList(fundGroupDetails);

            // 基金组合交易明细
            TradeCalendarExample calendarQuery = new TradeCalendarExample();
            calendarQuery.createCriteria().andFundGroupIdIn(fundGroupIds);
            List<TradeCalendar> tradeCalendars = tradeCalendarMapper.selectByExample(calendarQuery);
            userFundGroupData.setTradeCalendarList(tradeCalendars);
        }

        // 交易记录
        FundOrderExample fundOrderQuery = new FundOrderExample();
        fundOrderQuery.createCriteria()
                .andUserIdEqualTo(userId);
        List<FundOrder> fundOrders = fundOrderMapper.selectByExample(fundOrderQuery);
        userFundGroupData.setFundOrderList(fundOrders);

        return userFundGroupData;
    }
}
