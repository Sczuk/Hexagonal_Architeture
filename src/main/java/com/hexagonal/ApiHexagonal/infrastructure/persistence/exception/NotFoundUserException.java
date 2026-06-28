package com.hexagonal.ApiHexagonal.infrastructure.persistence.exception;

import com.hexagonal.ApiHexagonal.domain.exception.BaseException;
import org.springframework.http.HttpStatus;

public class NotFoundUserException extends BaseException {

    private final String code = "USER_NOT_FOUND";
    private final int httpStatusCode = HttpStatus.NOT_FOUND.value();

    public NotFoundUserException(String message) {
        super(message);
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
