package com.example.sysmanager.service;

import com.example.core.service.BaseService;
import com.example.sysmanager.entity.AclRequestType;

/**
 * Created by Athos on 2016-07-12.
 */
public interface AclRequestTypeService extends BaseService<AclRequestType> {
    String findPronounStrByRequestTypeIds(String requestTypeIds);
    int selectCountByNeId(AclRequestType aclRequestType);
}
