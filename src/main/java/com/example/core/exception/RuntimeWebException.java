package com.example.core.exception;

/**
 * Created by Administrator on 2016/12/10.
 */
@SuppressWarnings("serial")
public class RuntimeWebException extends RuntimeException {

    public RuntimeWebException() {
        super();
    }

    public RuntimeWebException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeWebException(String message) {
        super(message);
    }

    public RuntimeWebException(Throwable cause) {
        super(cause);
    }

}
