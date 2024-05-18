package org.sopt.sopkathon.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.dto.request.WordRequest;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class WordController {

    private final WordService wordService;

    @PostMapping("/{category_id}/words/input")
    public ResponseEntity<SuccessResponse> addWord(
            @PathVariable("category_id") Long category_id,
            @RequestBody WordRequest wordRequest) {
        SuccessResponse response = wordService.addWord(category_id, wordRequest);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{category_id}/words")
    public ResponseEntity<SuccessResponse> getWords(
            @PathVariable("category_id") Long category_id) {
                SuccessResponse response = wordService.getWords(category_id);
                return ResponseEntity.ok(response);
    }
}
