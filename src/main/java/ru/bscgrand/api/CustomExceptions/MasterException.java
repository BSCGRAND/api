package ru.bscgrand.api.CustomExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MasterException extends RuntimeException {
    public MasterException(String message) {
        super(message);
    }
}
