package org.sopt.sopkathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathon.domain.Category;
import org.sopt.sopkathon.dto.request.CategoryRequest;
import org.sopt.sopkathon.exception.dto.SuccessResponse;
import org.sopt.sopkathon.exception.enums.SuccessMessage;
import org.sopt.sopkathon.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
