package com.bookstore.common.application.exception;

import org.springframework.http.HttpStatus;

public interface ExceptionCode {
    String getCode();
    String getMessage();
    HttpStatus getStatus();

    default int getHttpStatus() {
        return getStatus().value();
    }
}