package org.sopt.sopkathon.dto.response;

import lombok.Builder;
import org.sopt.sopkathon.domain.Word;

@Builder
public record WordResponse(
        Long wordId,
        Long categoryId,
        String vocabulary,
        String meaning,
        int clickCount
) {
    public static WordResponse of(Word word){
        return WordResponse.builder()
                .wordId(word.getWordId())
                .categoryId(word.getCategory().getCategoryId())
                .vocabulary(word.getVocabulary())
                .meaning(word.getMeaning())
                .clickCount(word.getClickCount())
                .build();
    }
}
