package me.lzb.sqltest.util;

/**
 * Created by lzb on 2018/4/13.
 */
public class SqlTestUtil {



    public static String coverHumpToUnderline(String string) {
        char[] classNameCharArray = string.toCharArray();
        StringBuilder tableNameSb = new StringBuilder();

        tableNameSb.append(Character.toLowerCase(classNameCharArray[0]));
        for (int i = 1; i < classNameCharArray.length; i++) {
            char c = classNameCharArray[i];

            if (Character.isUpperCase(c)) {
                tableNameSb.append("_");
                tableNameSb.append(Character.toLowerCase(c));
            } else {
                tableNameSb.append(c);
            }
        }
        return tableNameSb.toString();
    }


}
