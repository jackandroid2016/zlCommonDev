package com.zl.common.http;

/**
 * @author ZL
 * @class describe
 * @time 2019/1/24 14:43
 */
public class BaseResponse<T> {
    private int code;
    private String msg;
    private T data;

    public boolean isOk() {
        return code == 0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
