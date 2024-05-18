package org.sopt.sopkathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.dto.request.CategoryRequest;
import org.sopt.sopkathon.dto.response.CategoryResponse;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/input")
    @Operation(summary = "카테고리 추가 API", description = "카테고리 추가 API 구현")
    public ResponseEntity<SuccessResponse> addCategory(CategoryRequest categoryRequest) {
        SuccessResponse response = categoryService.addCategory(categoryRequest);
        return ResponseEntity.status(201).body(response);
    }

    @GetMapping
    @Operation(summary = "카테고리 리스트 조회 API", description = "카테고리 리스트 조회 API 구현")
    public ResponseEntity<SuccessResponse<List<CategoryResponse>>> getCategories() {
        SuccessResponse<List<CategoryResponse>> response = categoryService.getCategories();
        return ResponseEntity.ok(response);
    }
}
