package com.example.sysmanager.service;

import com.example.core.service.BaseService;
import com.example.sysmanager.entity.AclUser;

/**
 * Created by Athos on 2016-07-02.
 */
public interface AclUserService extends BaseService<AclUser> {
    AclUser findAclUserByName(String userName);
}
