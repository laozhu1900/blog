package com.jar.Exception;

/**
 * Created by zhuzw_000 on 2015/8/25.
 */
public class CodeException extends RuntimeException {
    public CodeException() {
        super();
    }

    public CodeException(String message) {
        super(message);
    }

    public CodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeException(Throwable cause) {
        super(cause);
    }
}
