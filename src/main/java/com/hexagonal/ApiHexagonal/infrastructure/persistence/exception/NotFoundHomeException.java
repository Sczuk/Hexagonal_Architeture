package com.hexagonal.ApiHexagonal.infrastructure.persistence.exception;

import com.hexagonal.ApiHexagonal.domain.exception.BaseException;
import org.springframework.http.HttpStatus;

public class NotFoundHomeException extends BaseException {

    private final String code = "HOME_NOT_FOUND";
    private final int httpStatusCode = HttpStatus.NOT_FOUND.value();

    public NotFoundHomeException(String message) {
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
