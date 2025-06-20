package org.starbox.tingting.pojo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class ResponseMessage<T> {
    private String message;
    private T data;
    private Integer code;
    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T>ResponseMessage<T> success(T data){
        return new ResponseMessage(HttpStatus.OK.value(), "success",data);
    }

    public static <T>ResponseMessage<T> success(){
        return new ResponseMessage(HttpStatus.OK.value(), "success",null);
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

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
