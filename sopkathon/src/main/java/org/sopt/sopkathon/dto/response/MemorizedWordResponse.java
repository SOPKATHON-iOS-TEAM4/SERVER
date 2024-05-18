package org.sopt.sopkathon.dto.response;

public record MemorizedWordResponse(
        Long memorizedWordId,
        Long categoryId,
        String memorizedVocabulary,
        String memorizedMeaning
) {
}
