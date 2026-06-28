package com.hexagonal.ApiHexagonal.infrastructure.persistence.exception;

import com.hexagonal.ApiHexagonal.domain.exception.BaseException;
import org.springframework.http.HttpStatus;

public class NotFoundBillException extends BaseException {

    private final String code = "BILL_NOT_FOUND";
    private final int httpStatusCode = HttpStatus.NOT_FOUND.value();

    public NotFoundBillException(String message) {
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
