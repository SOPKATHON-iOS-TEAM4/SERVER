package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.Category;
import org.sopt.sopkathon.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findAllByCategory(Category category);

    List<Word> findAllByCategoryAndClickCountLessThan(Category category, int maxClickCount);
}
