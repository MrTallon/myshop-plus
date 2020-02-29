package com.funtl.myshop.plus.provider.service;

import com.funtl.myshop.plus.provider.api.UmsAdminService;
import com.funtl.myshop.plus.provider.domain.UmsAdmin;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class UmsAdminServiceImpl implements UmsAdminService {
    @Override
    public int insert(UmsAdmin admin) {
        return 1;
    }

}
