package com.gameloft9.demo.dataaccess.dao.system;

import java.util.List;

/**
 * @author: jc
 * @description:
 * @create: 2019/03/18 16:32
 */

public interface BaseMapper<T> {

    /**
     * 查找所有
     *
     * @return
     *      返回对象集合
     */
    List<T> getAll();

    /**
     * 添加
     *
     * @param t 需要添加的实体
     */
    void add(T t);

    /**
     * 更新
     *
     * @param t 需要跟新的实体
     */
    void update(T t);

    /**
     * 根据id删除
     *
     * @param id id
     */
    void delete(String id);

}
