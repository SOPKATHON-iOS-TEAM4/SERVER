package org.sopt.sopkathon.service;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.dto.response.MemorizedWordResponse;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.exception.enums.SuccessMessage;
import org.sopt.sopkathon.repository.MemorizedWordRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemorizedWordService {

    private final MemorizedWordRepository memorizedWordRepository;

    public SuccessResponse<List<MemorizedWordResponse>> getMemorizedWords() {
        List<MemorizedWordResponse> memorizedWordResponses = memorizedWordRepository.findAll().stream()
                .map(memorizedWord -> new MemorizedWordResponse(
                        memorizedWord.getMemorizedWordId(),
                        memorizedWord.getCategory().getCategoryId(),
                        memorizedWord.getMemorizedVocabulary(),
                        memorizedWord.getMemorizedMeaning()))
                .collect(Collectors.toList());

        return SuccessResponse.of(SuccessMessage.SUCCESS_GET_MEMORIZEDWORDS, memorizedWordResponses);
    }

}
