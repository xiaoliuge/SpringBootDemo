package com.example.sysmanager.service.impl;

import org.springframework.stereotype.Service;

import com.example.core.annotation.MapperClass;
import com.example.core.service.impl.MyBatisBaseServiceImpl;
import com.example.sysmanager.entity.AclRole;
import com.example.sysmanager.mapper.AclRoleMapper;
import com.example.sysmanager.service.AclRoleService;

/**
 * Created by Athos on 2016-07-12.
 */
@Service
@MapperClass(AclRoleMapper.class)
public class AclRoleServiceImpl extends MyBatisBaseServiceImpl<AclRole> implements AclRoleService{

    protected AclRoleMapper getMapper(){
        return super.getMapper(AclRole.class);
    }

    @Override
    public String findAclRolesByAclUserRoleIds(String roleIds) {
        return this.getMapper().findAclRolesByAclUserRoleIds(roleIds);
    }
}