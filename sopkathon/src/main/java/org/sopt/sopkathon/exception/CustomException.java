package org.sopt.sopkathon.exception;

import lombok.Getter;
import org.sopt.sopkathon.exception.enums.ErrorMessage;

@Getter
public class CustomException extends RuntimeException {

    private ErrorMessage errorMessage;

    public CustomException(ErrorMessage errorMessage) {
        super(errorMessage.getMessage());
        this.errorMessage = errorMessage;
    }
}
