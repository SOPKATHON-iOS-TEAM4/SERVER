package org.sopt.sopkathon.repository;

import org.sopt.sopkathon.domain.MemorizedWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemorizedWordRepository extends JpaRepository<MemorizedWord, Long> {
}
