package me.dingtou.service.impl;

import me.dingtou.domain.*;
import me.dingtou.domain.dto.UserFundGroupData;
import me.dingtou.mapper.*;
import me.dingtou.service.DataExportService;
import me.dingtou.service.DataImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataImportServiceImpl implements DataImportService {
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

    @Autowired
    private DataExportService dataExportService;

    @Override
    @Transactional
    public UserFundGroupData importData(UserFundGroupData data) {
        if (null == data || null == data.getUserInfo() || null == data.getUserFundGroupList()) {
            return null;
        }

        // 基金明细
        List<FundInfo> fundInfoList = data.getFundInfoList();
        if (null != fundInfoList) {
            fundInfoList.stream().forEach(e -> {
                FundInfo fundInfo = fundInfoMapper.selectByPrimaryKey(e.getFundCode());
                if (null != fundInfo) {
                    fundInfoMapper.updateByPrimaryKeySelective(e);
                } else {
                    fundInfoMapper.insert(e);
                }
            });
        }

        // 用户信息
        UserInfo userInfo = data.getUserInfo();
        UserInfo userInfoDB = userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
        if (null != userInfoDB) {
            userInfoMapper.updateByPrimaryKeySelective(userInfo);
        } else {
            userInfoMapper.insert(userInfo);
        }

        UserFundGroupExample groupQuery = new UserFundGroupExample();
        groupQuery.createCriteria().andUserIdEqualTo(userInfo.getUserId());

        // 删除老的组合数据
        List<UserFundGroup> userFundGroupsDB = userFundGroupMapper.selectByExample(groupQuery);
        userFundGroupsDB.stream().forEach(e -> {
            TradeCalendarExample deleteCalendar = new TradeCalendarExample();
            deleteCalendar.createCriteria().andFundGroupIdEqualTo(e.getFundGroupId());
            tradeCalendarMapper.deleteByExample(deleteCalendar);

            FundGroupDetailExample deleteQuery = new FundGroupDetailExample();
            deleteQuery.createCriteria().andFundGroupIdEqualTo(e.getFundGroupId());
            fundGroupDetailMapper.deleteByExample(deleteQuery);
        });
        userFundGroupMapper.deleteByExample(groupQuery);
        FundOrderExample deleteOrderQuery = new FundOrderExample();
        deleteOrderQuery.createCriteria().andUserIdEqualTo(userInfo.getUserId());
        fundOrderMapper.deleteByExample(deleteOrderQuery);


        // 基金组合
        List<UserFundGroup> userFundGroupList = data.getUserFundGroupList();
        userFundGroupList.stream().forEach(e -> {
            userFundGroupMapper.insert(e);
        });

        // 基金组合明细
        List<FundGroupDetail> fundGroupDetailList = data.getFundGroupDetailList();
        if (null != fundGroupDetailList) {
            fundGroupDetailList.stream().forEach(e -> {
                fundGroupDetailMapper.insert(e);
            });
        }

        // 交易记录
        List<FundOrder> fundOrderList = data.getFundOrderList();
        if (null != fundOrderList) {
            fundOrderList.stream().forEach(e -> {
                fundOrderMapper.insert(e);
            });
        }
        return dataExportService.exportAll(userInfo.getUserId());
    }
}
