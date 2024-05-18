package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
