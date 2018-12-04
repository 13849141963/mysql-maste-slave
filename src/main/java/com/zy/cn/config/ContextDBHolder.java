package com.zy.cn.config;

public class ContextDBHolder {

    private static final ThreadLocal<String> t = new ThreadLocal<String>();

    /****
     * 设置数据源
     * @param key
     */
    public static void setDataSource(String key){
        t.set(key);
    }

    /*****
     * 返回数据源
     */
    public static String getDataSource(){
       return t.get();
    }
    /*****
     * 释放数据源
     */
    public static void closeDataSource(){
        t.remove();
    }
}
