package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long> {
}
