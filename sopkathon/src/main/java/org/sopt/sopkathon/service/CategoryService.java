package org.sopt.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.domain.Category;
import org.sopt.sopkathon.dto.request.CategoryRequest;
import org.sopt.sopkathon.dto.response.CategoryResponse;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.exception.enums.SuccessMessage;
import org.sopt.sopkathon.repository.CategoryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public SuccessResponse addCategory(CategoryRequest categoryRequest) {
        Category category = Category.createCategory(categoryRequest.categoryName());
        categoryRepository.save(category);
        return SuccessResponse.of(SuccessMessage.SUCCESS_CREATE_CATEGORY);
    }

    public SuccessResponse<List<CategoryResponse>> getCategories(){
        List<CategoryResponse> categoryResponses = categoryRepository.findAll().stream()
                .map(category -> new CategoryResponse(
                        category.getCategoryId(),
                        category.getCategoryName(),
                        category.getWordList().size()))
                .collect(Collectors.toList());

        return SuccessResponse.of(SuccessMessage.SUCCESS_GET_CATEGORIES, categoryResponses);
    }

}
