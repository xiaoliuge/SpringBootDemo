package com.example.core.service.impl;

import javax.annotation.Resource;

import com.example.core.dao.BaseDao;
import com.example.core.entity.BaseEntity;
import com.example.core.service.BaseService;
import com.example.core.util.GenericeClassUtils;

import java.util.List;

public class RedisBaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

	@SuppressWarnings("unchecked")
	protected Class<T> entityClass = (Class<T>) GenericeClassUtils.getSuperClassGenricType(this.getClass(), 0);
		
	@Resource(name = "redisBaseDao")
	private BaseDao<T> baseDao;
	
	@Override
	public T getEntityById(Integer id) {
		return baseDao.getEntityById(entityClass, id);
	}

	@Override
	public void addEntity(T entity) {
		baseDao.addEntity(entity);
	}

	@Override
	public void updateEntity(T entity) {
		baseDao.updateEntity(entity);
	}

	@Override
	public void deleteEntityById(Integer id) {
		baseDao.deleteEntityById(entityClass, id);
	}

	@Override
	public List<T> selectAll() {
		return baseDao.selectAll(entityClass);
	}


}
