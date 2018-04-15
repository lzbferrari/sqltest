package me.lzb.sqltest.init;

import me.lzb.sqltest.annotation.Data;
import me.lzb.sqltest.util.SqlTestUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Created by lzb on 2018/4/10.
 */
public class ProcessData {
    private static Set<Class> DbDataTypeSet;

    static {
        DbDataTypeSet = new HashSet<Class>();
        DbDataTypeSet.add(short.class);
        DbDataTypeSet.add(Short.class);
        DbDataTypeSet.add(int.class);
        DbDataTypeSet.add(Integer.class);
        DbDataTypeSet.add(long.class);
        DbDataTypeSet.add(Long.class);
        DbDataTypeSet.add(float.class);
        DbDataTypeSet.add(Float.class);
        DbDataTypeSet.add(double.class);
        DbDataTypeSet.add(Double.class);
        DbDataTypeSet.add(String.class);
        DbDataTypeSet.add(Date.class);
    }

    public static List<String> dataToSql(List<Data> dataList) {
        if (CollectionUtils.isEmpty(dataList)) {
            return new ArrayList<String>();
        }
        List<String> sqlList = new ArrayList<String>();
        //清理数据,删除表
        dropTable(dataList, sqlList);
        //建表

        //生成sql
        //执行sql插入数据

        for (Data data : dataList) {


        }

        return sqlList;
    }


    private static void dropTable(List<Data> dataList, List<String> sqlList) {
        for (Data data : dataList) {
            String dropSql = "drop table if exists " + SqlTestUtil.coverHumpToUnderline(data.entityClass().getSimpleName());
            sqlList.add(dropSql);
        }


    }


    private static void createSql(List<Data> dataList, List<String> sqlList) {

        for (Data data : dataList) {
            StringBuilder sb = new StringBuilder();
            Field[] fieldArray = data.entityClass().getDeclaredFields();
            for (Field field : fieldArray) {
                field.setAccessible(true);
                //忽略静态变量
                if (Modifier.isStatic(field.getModifiers())) {
                    continue;
                }
                //忽略非数据库支持的数据类型
                if (!DbDataTypeSet.contains(field.getType())) {
                    continue;
                }





            }
        }

    }


}
