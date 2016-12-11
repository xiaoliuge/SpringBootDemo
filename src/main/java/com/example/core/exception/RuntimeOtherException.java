package com.example.core.exception;

/**
 * Created by Administrator on 2016/12/10.
 */
@SuppressWarnings("serial")
public class RuntimeOtherException extends RuntimeException {

    public RuntimeOtherException() {
        super();
    }

    public RuntimeOtherException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeOtherException(String message) {
        super(message);
    }

    public RuntimeOtherException(Throwable cause) {
        super(cause);
    }

}