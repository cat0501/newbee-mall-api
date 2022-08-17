package com.newbee.mall.util;

import cn.hutool.core.util.StrUtil;
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

    // 构造方法————————————————————————————————————————————————————————————
    public R() {
    }

    public R(int code, String message) {
        this.code = code;
        this.message = message;
    }

    // 构造结果————————————————————————————————————————————————————————————
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";
    private static final int RESULT_CODE_SUCCESS = 200;
    private static final int RESULT_CODE_SERVER_ERROR = 500;

    public R<T> ok(){
        R<T> r = new R<>();
        r.setCode(RESULT_CODE_SUCCESS);
        r.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return r;
    }
    public R<T> ok(String message){
        R<T> r = new R<>();
        r.setCode(RESULT_CODE_SUCCESS);
        r.setMessage(message);
        return r;
    }
    public R<T> ok(T data){
        R<T> r = new R<>();
        r.setCode(RESULT_CODE_SUCCESS);
        r.setMessage(DEFAULT_SUCCESS_MESSAGE);
        r.setData(data);
        return r;
    }

    public R<T> fail(String message){
        R<T> r = new R<>();
        r.setCode(RESULT_CODE_SERVER_ERROR);
        r.setMessage( StrUtil.isEmpty(message) ? DEFAULT_FAIL_MESSAGE : message);
        return r;
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
