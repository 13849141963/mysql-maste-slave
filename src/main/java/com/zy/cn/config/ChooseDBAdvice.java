package com.zy.cn.config;

import com.zy.cn.annotation.Read;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/****
 * 作用:根据目标类中调用的方法往DynamicDataSource中的determineCurrentLookupKey方法动态设置返回值
 * 目标类: save update delete  相关方法使用write
 *        query select        相关方法使用read
 */
@Component("chooseDBAdvice")
public class ChooseDBAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //获取方法对象
        Method method = invocation.getMethod();
        //判断当前方上是否存在read注解
        boolean annotationPresent = method.isAnnotationPresent(Read.class);
        if(annotationPresent){
            //设置读数据源
            ContextDBHolder.setDataSource("read");
            System.out.println("设置读数据源~~~~~~");
        }else{
            //设置写数据源
            ContextDBHolder.setDataSource("write");
            System.out.println("设置写数据源~~~~~~");
        }
        //执行目标方法
        Object proceed = invocation.proceed();
        //释放数据源
        ContextDBHolder.closeDataSource();
        return proceed;
    }
}
