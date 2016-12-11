package com.example.core.exception;

/**
 * Created by Administrator on 2016/12/10.
 */
@SuppressWarnings("serial")
public class RuntimeServiceException extends RuntimeException {

    public RuntimeServiceException() {
        super();
    }

    public RuntimeServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeServiceException(String message) {
        super(message);
    }

    public RuntimeServiceException(Throwable cause) {
        super(cause);
    }

}
