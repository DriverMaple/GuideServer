package com.maple.guideserver.common;

import java.util.Objects;

/**
 * Created by Maple on 2017/9/14.
 */
public class Result {
    private Object value;
    private String message;
    private int result;
    //结果状态码
    public static int SUCCESS = 1;
    public static int FAIL = 0;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
