package com.bookstore.common.application.exception;

import java.nio.file.AccessDeniedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(CustomException.class)
    public ExceptionResponse handleCustomException(CustomException exc) {
        return new ExceptionResponse(exc.getCode(), exc.getMessage(), exc.getHttpStatus());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ExceptionResponse handleAccessDeniedException(AccessDeniedException exc) {
        return new ExceptionResponse("ACCESS_DENIED", "접근이 거부된 권한입니다.",
            HttpStatus.FORBIDDEN.value());

    }
}
