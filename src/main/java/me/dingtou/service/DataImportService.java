package me.dingtou.service;

import me.dingtou.domain.dto.UserFundGroupData;

/**
 * 数据导出工具
 */
public interface DataImportService {

    /**
     * @param data 用户数据
     * @return
     */
    UserFundGroupData importData(UserFundGroupData data);

}
