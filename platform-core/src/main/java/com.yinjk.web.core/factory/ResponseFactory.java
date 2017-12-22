package com.yinjk.web.core.factory;

import com.yinjk.web.core.enums.EApiStatus;
import com.yinjk.web.core.vo.ResponseVO;

public class ResponseFactory {
    public ResponseFactory() {
    }

    /**
     * 创造一个 0-success 的返回结果
     */
    public static ResponseVO ok(Object obj) {
        ResponseVO vo = new ResponseVO();
        vo.setData(obj);
        vo.setMessage(EApiStatus.SUCCESS.getMessage());
        vo.setStatus(EApiStatus.SUCCESS.getStatus());
        return vo;
    }


    public static ResponseVO err(Object obj, EApiStatus status) {
        ResponseVO vo = new ResponseVO();
        vo.setData("");
        vo.setMessage(String.valueOf(obj));
        vo.setStatus(status.getStatus());
        return vo;
    }
}