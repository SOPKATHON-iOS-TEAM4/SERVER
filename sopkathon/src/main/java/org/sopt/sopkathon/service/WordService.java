package org.sopt.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.domain.Category;
import org.sopt.sopkathon.domain.Word;
import org.sopt.sopkathon.dto.request.WordRequest;
import org.sopt.sopkathon.dto.response.WordResponse;
import org.sopt.sopkathon.exception.CustomException;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.exception.enums.SuccessMessage;
import org.sopt.sopkathon.repository.CategoryRepository;
import org.sopt.sopkathon.repository.WordRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.sopt.sopkathon.exception.enums.ErrorMessage.NOT_FOUND_CATEGORY;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class WordService {

    private final CategoryRepository categoryRepository;
    private final WordRepository wordRepository;

    @Transactional
    public SuccessResponse addWord(Long categoryId, WordRequest wordRequest) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CustomException(NOT_FOUND_CATEGORY));

        Word word = Word.createWord(category, wordRequest.vocabulary(), wordRequest.meaning(), 0);
        wordRepository.save(word);

        return SuccessResponse.of(SuccessMessage.SUCCESS_CREATE_WORD);
    }

    public SuccessResponse<List<WordResponse>> getWords(Long categoryId){
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new CustomException(NOT_FOUND_CATEGORY));
        List<Word> words = wordRepository.findAllByCategory(category);
        List<WordResponse> wordResponses = words.stream()
                .map(WordResponse::of)
                .collect(Collectors.toList());

        return SuccessResponse.of(SuccessMessage.SUCCESS_GET_WORDS, wordResponses);
    }
}
