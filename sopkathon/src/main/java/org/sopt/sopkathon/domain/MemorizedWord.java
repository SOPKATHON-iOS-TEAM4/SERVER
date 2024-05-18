package org.sopt.sopkathon.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemorizedWord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memorizedWordId;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @Column(nullable = false, length = 64)
    private String memorizedVocabulary;

    @Column(nullable = false, length = 64)
    private String memorizedMeaning;

    @Builder(access = PRIVATE)
    private MemorizedWord(final Category category, final String memorizedVocabulary, final String memorizedMeaning) {
        this.category = category;
        this.memorizedVocabulary = memorizedVocabulary;
        this.memorizedMeaning = memorizedMeaning;
    }

    public static MemorizedWord createMemorizedWord(final Category category, final String memorizedVocabulary, final String memorizedMeaning) {
        return MemorizedWord.builder()
                .category(category)
                .memorizedVocabulary(memorizedVocabulary)
                .memorizedMeaning(memorizedMeaning)
                .build();
    }

}
