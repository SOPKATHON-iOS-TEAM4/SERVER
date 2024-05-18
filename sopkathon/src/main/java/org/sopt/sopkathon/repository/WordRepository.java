package org.sopt.sopkathon.repository;

import java.util.List;
import java.util.Optional;
import org.sopt.sopkathon.domain.Category;
import org.sopt.sopkathon.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findAllByCategory(Category category);

    List<Word> findAllByCategoryAndClickCountLessThan(Category category, int maxClickCount);

    Optional<Word> findByCategoryCategoryIdAndWordId(Long categoryId, Long wordId);
}
