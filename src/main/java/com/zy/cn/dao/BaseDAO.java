package com.zy.cn.dao;

import java.util.List;
import java.util.Map;

public interface BaseDAO<T> {


    void insert(T t);

    void delete(T t);

    void update(T t);

    List<T> queryAll();

}
