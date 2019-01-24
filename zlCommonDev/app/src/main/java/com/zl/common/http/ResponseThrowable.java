package com.zl.common.http;

/**
 * @author ZL
 * @class describe
 * @time 2019/1/24 15:00
 */
public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
