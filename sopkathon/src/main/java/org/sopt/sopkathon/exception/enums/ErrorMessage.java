package org.sopt.sopkathon.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    ;
    private final int status;
    private final String message;
}
