package com.example.sysmanager.service.impl;

import org.springframework.stereotype.Service;

import com.example.core.annotation.MapperClass;
import com.example.core.service.impl.MyBatisBaseServiceImpl;
import com.example.sysmanager.entity.AclRequestType;
import com.example.sysmanager.mapper.AclRequestTypeMapper;
import com.example.sysmanager.service.AclRequestTypeService;

/**
 * Created by Athos on 2016-07-12.
 */
@Service
@MapperClass(AclRequestType.class)
public class AclRequestTypeServiceImpl extends MyBatisBaseServiceImpl<AclRequestType> implements AclRequestTypeService{

    protected AclRequestTypeMapper getMapper(){
        return super.getMapper(AclRequestType.class);
    }

    @Override
    public String findPronounStrByRequestTypeIds(String requestTypeIds) {
        return this.getMapper().findPronounStrByRequestTypeIds(requestTypeIds);
    }

    @Override
    public int selectCountByNeId(AclRequestType aclRequestType){
        return 0;
    }
}
