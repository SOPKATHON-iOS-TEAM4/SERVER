package org.sopt.sopkathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.dto.request.WordRequest;
import org.sopt.sopkathon.dto.response.WordResponse;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class WordController {

    private final WordService wordService;

    @PostMapping("/{category_id}/words/input")
    @Operation(summary = "새로운 단어 추가 API", description = "새로운 단어 추가 API 구현")
    public ResponseEntity<SuccessResponse> addWord(
            @PathVariable("category_id") Long category_id,
            @RequestBody WordRequest wordRequest) {
        SuccessResponse response = wordService.addWord(category_id, wordRequest);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{category_id}/words")
    @Operation(summary = "단어 리스트 조회 API", description = "단어 리스트 조회 API 구현")
    public ResponseEntity<SuccessResponse<List<WordResponse>>> getWords(
            @PathVariable("category_id") Long category_id) {
                SuccessResponse<List<WordResponse>> response = wordService.getWords(category_id);
                return ResponseEntity.ok(response);
    }

    @GetMapping("/{category_id}/words/{word_id}")
    public ResponseEntity<SuccessResponse> getWord(
            @PathVariable("category_id") Long category_id,
            @PathVariable("word_id") Long word_id) {
        SuccessResponse response = wordService.getWord(category_id, word_id);
        return ResponseEntity.ok(response);
    }
}
