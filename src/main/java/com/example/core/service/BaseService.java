package com.example.core.service;
import com.example.core.entity.BaseEntity;

import java.util.List;
/**
 * Created by Administrator on 2016/12/10.
 */
public interface BaseService<T extends BaseEntity> {

    /**
     * 根据Id查询实体
     */
    T getEntityById(final Integer id);

    /**
     * 新增实体
     */
    void addEntity(final T entity);
    /**
     * 更新实体
     */
    void updateEntity(final T entity);

    /**
     * 根据Id删除实体
     */
    void deleteEntityById(final Integer id);

    /**
     * 查询所有
     */
    List<T> selectAll();

}
