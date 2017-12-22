package com.yinjk.web.core.util;

import java.util.Collection;
import java.util.Map;

/**
* @Description : 校验工具类
* @author yinjiankang
* @date : 2017/12/22
**/
public class ValidateUtil {

    /**
     * 校验字符串包含内容
     * @param s 要检验的字符串
     * @return 校验结果
     */
    public static boolean isBlank(String s){
        return null == s || s.trim().equals("");
    }

    public static boolean isEmpty(String s) {
        return null == s || s.equals("");
    }

    public static boolean isEmpty(Collection collection) {
        return collection == null || collection.size() <= 0;
    }

    public static boolean isEmpty(Map map) {
        return map == null || map.entrySet().size() <= 0;
    }

    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNotNull(Object object) {
        return object != null;
    }



}
