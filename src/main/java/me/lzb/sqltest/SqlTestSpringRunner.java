package me.lzb.sqltest;

import me.lzb.sqltest.annotation.Data;
import me.lzb.sqltest.annotation.DataArray;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 扩展SpringJUnit4ClassRunner
 * Created by lzb on 2018/4/9.
 */
public class SqlTestSpringRunner extends SpringJUnit4ClassRunner {

    private final static Log logger = LogFactory.getLog(SqlTestSpringRunner.class);

    public SqlTestSpringRunner(Class<?> clazz) throws InitializationError {
        super(clazz);
    }


    @Override
    protected void runChild(FrameworkMethod frameworkMethod, RunNotifier notifier) {
        //获取测试方法
        Method method = frameworkMethod.getMethod();
        //获取需要初始化的数据
        List<Data> dataList = getDateList(method);
        //将数据插入数据库

        //执行测试

    }


    private final static List<Data> getDateList(Method method) {
        List<Data> dataList = new ArrayList<Data>();
        Data data = method.getAnnotation(Data.class);
        if (data != null) {
            dataList.add(data);
        }

        DataArray dataArray = method.getAnnotation(DataArray.class);
        if (dataArray != null) {
            Data[] datas = dataArray.value();
            for (Data d : datas) {
                dataList.add(d);
            }
        }

        return dataList;
    }

}
