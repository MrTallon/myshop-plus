package com.funtl.myshop.plus.provider.api;

import com.funtl.myshop.plus.provider.domain.UmsAdmin;

/**
 * 用户管理服务
 */
public interface UmsAdminService {
    /**
     * 新增用户
     * @param admin
     * @return
     */
    int insert(UmsAdmin admin);
}
