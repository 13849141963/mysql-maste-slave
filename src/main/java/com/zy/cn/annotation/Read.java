package com.zy.cn.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/****
 * 自定义注解类型:
 *          @Retention :元注解-->修饰注解的注解
 *               RetentionPolicy:SOURCE 源码有效 编译之后不会再.class文件中
 *                               CLASS 编译有效  编译之后会留在.class文件中 运行时不生效
 *                               RUNTIME  运行时有效
 *          @Target :作用修饰自定义注解类可以加在什么位置
 *               ElementType:METHOD 使用在方法上
 *                           TYPE   使用在类上
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Read {
}
