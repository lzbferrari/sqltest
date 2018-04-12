package me.lzb.sqltest.annotation;

import java.lang.annotation.*;

/**
 * 一行数据
 * Created by lzb on 2018/3/19.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Data {

    /**
     * 表对应的实体类
     *
     * @return
     */
    Class<?> entityClass() default Object.class;

    /**
     * 插入的行数
     *
     * @return
     */
    int count() default 1;

    /**
     * 数据json
     *
     * @return
     */
    String dataJson() default "{}";
}
