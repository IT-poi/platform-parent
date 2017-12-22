package com.yinjk.web.core.util;

import org.springframework.util.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/**
* @Description : 集合工具类
* @author yinjiankang
* @date : 2017/12/22
**/
public class CollectionUtils {

    /**
     * 通过反射将object非空的属性存入map
     * @param object
     * @param map
     */
    public static void putObjToMap(Object object, Map<String, ? super Object> map){
        Class cc = object.getClass();
        //获得所有私有字段
        Field[] fields =  cc.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            //字段名
            String fieldName = fields[i].getName();
            System.out.println(fieldName);
            //根据字段名拼接对应get方法
            String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
            Method method = null;
            try {
                //获得get方法
                method = cc.getMethod(methodName);
            } catch (NoSuchMethodException e) {
                continue;
            }
            if (method != null) {
                try {
                    //执行get方法取得方法返回值
                    Object result = method.invoke(object);
                    if (result == null) { //返回值为null则跳过该字段，读取下一个字段
                        continue;
                    } else if (result instanceof String) {
                        String sresult = (String) result;
                        if (!ValidateUtil.isBlank(sresult)) { //如果是String，并且String不是空格和空串
                            //添加到map
                            map.put(fieldName, result);
                        }
                    } else {
                        //其他类型只要不是null，均添加到map
                        map.put(fieldName, result);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }




}
