package com.yinjk.web.core.dao;

import java.util.List;
import java.util.Map;

/**
 * 基础dao类，查找单个用get，查找多个用find
 * K是主键，V是实体
 */
public interface BaseDAO<K, V> {

    /**
     * 根据id查找
     * @param var1 主键
     * @return 查找结果
     */
    V getById(K var1);

    /**
     * 根据var1中的值条件查询，返回单条
     * @param var1 查询条件
     * @return 单条结果
     */
    V getBy(Map<String, Object> var1);

    /**
     * 根据var1中的条件查询多条
     * @param var1 查询条件
     * @return 查询结果
     */
    List<V> listBy(Map<String, Object> var1);

    /**
     * 查询所有
     * @return 所有结果
     */
    List<V> listAll();

    /**
     * 插入一条
     * @param value 要插入的数据
     * @return 影响的行数
     */
    int insert(V value);

    /**
     * 插入多条
     * @param list data
     * @return 影响的行数
     */
    int insertList(List<V> list);

    /**
     * 更新一行
     * @param value data
     * @return 影响的行数
     */
    int update(V value);

    /**
     * 更新多行
     * @param list data
     * @return 影响的行数
     */
    int updateList(List<V> list);

    /**
     * 删除一条数据
     * @param var1 id
     * @return 影响的行数
     */
    int deleteById(K var1);

    /**
     * 删除多条数据
     * @param ids ids
     * @return 影响的行数
     */
    int deleteByIds(K[] ids);
}
