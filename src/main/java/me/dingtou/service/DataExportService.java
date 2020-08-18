package me.dingtou.service;

import me.dingtou.domain.dto.UserFundGroupData;

/**
 * 数据导出工具
 */
public interface DataExportService {

    /**
     * @param userId 要导出数据的用户ID
     * @return
     */
    UserFundGroupData exportAll(long userId);

}
