package com.gospeltube.videos.exception;

import com.gospeltube.videos.dto.ResponseDto;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ResponseDto> handleDuplicateException(BadRequestException ex) {
        ResponseDto response = new ResponseDto("99", ex.getMessage(), false, null);
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
