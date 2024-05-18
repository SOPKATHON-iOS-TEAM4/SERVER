package org.sopt.sopkathon.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    SUCCESS_CREATE_CATEGORY(201, true, "카테고리를 성공적으로 추가하였습니다.")
    ;

    private final int status;
    private final boolean success;
    private final String message;
}
