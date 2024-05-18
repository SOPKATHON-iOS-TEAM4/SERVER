package org.sopt.sopkathon.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    ;
    private final int status;
    private final boolean success;
    private final String message;
}
