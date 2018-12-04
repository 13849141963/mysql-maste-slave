package com.zy.cn.config;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/****
 * 产生动态数据源      AbstractRoutingDataSource是spring提供对数据源进行选择的类
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    /***
     * 根据返回的key决定使用哪个数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {

        return ContextDBHolder.getDataSource();
    }
}
