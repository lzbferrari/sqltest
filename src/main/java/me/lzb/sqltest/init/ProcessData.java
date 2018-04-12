package me.lzb.sqltest.init;

import me.lzb.sqltest.annotation.Data;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzb on 2018/4/10.
 */
public class ProcessData {


    public static List<String> dataToSql(List<Data> dataList) {
        if (CollectionUtils.isEmpty(dataList)) {
            return new ArrayList<String>();
        }
        List<String> sqlList = new ArrayList<String>();
        //清理数据,删除表
        //建表
        //生成sql
        //执行sql插入数据

        for (Data data : dataList) {


        }

        return sqlList;
    }


    private static void clean(List<Data> dataList, List<String> sqlList) {
        for (Data data: dataList) {

        }


    }


    private static void createSql(Data data, List<String> sqlList) {
        String dataJson = data.dataJson();

    }


}
