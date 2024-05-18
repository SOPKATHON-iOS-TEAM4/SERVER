package org.sopt.sopkathon.exception;

import org.sopt.sopkathon.exception.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException e) {
        return ResponseEntity
                .badRequest()
                .body(ErrorResponse.of(
                        e.getErrorMessage().getStatus(),
                        e.getErrorMessage().getMessage())
                );
    }
}
