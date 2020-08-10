package com.haoyong.pdf.exception;

/**
 * @program: pdf
 * @description: 自定义异常
 * @author: zxb
 * @create: 2020-08-04 09:29
 **/
public class MyselfException extends RuntimeException {
    protected Integer code;
    protected String message;
    public MyselfException(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
