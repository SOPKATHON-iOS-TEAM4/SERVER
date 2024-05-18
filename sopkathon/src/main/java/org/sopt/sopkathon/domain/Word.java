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
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category category;

    @Column(nullable = false, length = 64)
    private String vocabulary;

    @Column(nullable = false, length = 64)
    private String meaning;

    private int clickCount;

    @Builder(access = PRIVATE)
    private Word(final Category category, final String vocabulary, final String meaning, final int clickCount)
    {
        this.category = category;
        this.vocabulary = vocabulary;
        this.meaning = meaning;
        this.clickCount = clickCount;
    }

    public static Word createWord(final Category category, final String vocabulary, final String meaning, final int clickCount)
    {
        return Word.builder()
                .category(category)
                .vocabulary(vocabulary)
                .meaning(meaning)
                .clickCount(0)
                .build();
    }
}
