package com.yinjk.web.core.enums;


public enum EApiStatus {
    SUCCESS("0", "success"),
    ERR_SYS("1", "系统错误"),
    ERR_VALIDATE("2", "参数验证错误"),
    ERR_NEED_LOGIN("100", "需要登录"),
    ERR_PERMISSION("101", "没有权限"),
    CALLBACK_EROR("-9", "消息平台通知切片接口失败");

    String status;
    String message;

    private EApiStatus(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
