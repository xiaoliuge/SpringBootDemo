package com.example.sysmanager.service.impl;

import org.springframework.stereotype.Service;

import com.example.core.annotation.MapperClass;
import com.example.core.service.impl.MyBatisBaseServiceImpl;
import com.example.sysmanager.entity.AclUser;
import com.example.sysmanager.mapper.AclUserMapper;
import com.example.sysmanager.service.AclUserService;

/**
 * Created by Athos on 2016-07-02.
 */
@Service
@MapperClass(AclUserMapper.class)
public class AclUserServiceImpl extends MyBatisBaseServiceImpl<AclUser> implements AclUserService {
//    @CountTime
    @Override
    public AclUser findAclUserByName(String userName) {
        return getMapper().findAclUserByName(userName);
    }
    protected AclUserMapper getMapper(){
        return super.getMapper(AclUser.class);
    }
}
