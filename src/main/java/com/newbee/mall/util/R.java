package com.newbee.mall.util;

import java.io.Serializable;

/**
 * @description
 * @author Lemonade
 * @updateTime 2022/8/16 11:35 PM
 */
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private String message;
    private T data;

    // 构造————————————————————————————————————————————————————————————
    public R() {
    }

    public R(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // get、set、toString————————————————————————————————————————————————————————————
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
