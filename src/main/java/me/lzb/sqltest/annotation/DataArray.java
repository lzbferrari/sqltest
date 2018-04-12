package me.lzb.sqltest.annotation;

import java.lang.annotation.*;

/**
 * 多行数据
 * Created by lzb on 2018/3/19.
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DataArray {

    /**
     * 多行数据组成的数组
     *
     * @return
     */
    Data[] value();
}
