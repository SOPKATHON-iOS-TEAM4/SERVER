package org.sopt.sopkathon.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorMessage {

    NOT_FOUND_CATEGORY(404, "해당 카테고리가 존재하지 않습니다."),
    NOT_FOUND_WORD(404, "해당 단어가 존재하지 않습니다.");
    
    private final int status;
    private final String message;
}
