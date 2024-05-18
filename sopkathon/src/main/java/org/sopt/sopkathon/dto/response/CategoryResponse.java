package org.sopt.sopkathon.dto.response;

public record CategoryResponse(
        Long categoryId,
        String categoryName,
        int wordsNumber
) {
}
