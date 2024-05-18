package org.sopt.sopkathon.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.dto.response.MemorizedWordResponse;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.service.MemorizedWordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/memorized-words")
public class MemorizedWordController {

    private final MemorizedWordService memorizedWordService;

    @GetMapping
    public ResponseEntity<SuccessResponse<List<MemorizedWordResponse>>> getMemorizedWords() {
        SuccessResponse<List<MemorizedWordResponse>> response = memorizedWordService.getMemorizedWords();
        return ResponseEntity.ok(response);
    }
}
