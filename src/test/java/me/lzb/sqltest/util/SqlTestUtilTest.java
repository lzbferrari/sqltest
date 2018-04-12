package me.lzb.sqltest.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lzb on 2018/4/13.
 */
public class SqlTestUtilTest {

    @Test
    public void getTableName() {
        String tableName = SqlTestUtil.getTableName(SqlTestUtilTest.class);
        Assert.assertEquals("sql_test_util_test", tableName);
    }


}