package com.example.sysmanager.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.core.annotation.MapperClass;
import com.example.core.service.impl.MyBatisBaseServiceImpl;
import com.example.sysmanager.entity.AclResources;
import com.example.sysmanager.mapper.AclResourcesMapper;
import com.example.sysmanager.service.AclResourcesService;

/**
 * Created by Athos on 2016-07-12.
 */
@Service
@MapperClass(AclResourcesMapper.class)
public class AclResourcesServiceImpl extends MyBatisBaseServiceImpl<AclResources> implements AclResourcesService {

    protected AclResourcesMapper getMapper(){
        return super.getMapper(AclResources.class);
    }

    @Override
    public List<AclResources> selectAclResourcesTypeOfRequest(){
       return getMapper().selectAclResourcesTypeOfRequest();
    }

    @Override
    public List<AclResources> selectAclResourcesByResourceIds(String resourceIds) {
        return getMapper().selectAclResourcesByResourceIds(resourceIds.split(","));
}
}
