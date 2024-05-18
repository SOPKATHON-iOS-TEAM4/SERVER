package org.sopt.sopkathon.domain;

import static lombok.AccessLevel.PRIVATE;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(nullable = false, length = 64)
    private String vocabulary;

    @Column(nullable = false, length = 64)
    private String meaning;

    private int clickCount;

    @Builder(access = PRIVATE)
    private Word(final Category category, final String vocabulary, final String meaning, final int clickCount) {
        this.category = category;
        this.vocabulary = vocabulary;
        this.meaning = meaning;
        this.clickCount = clickCount;
    }

    public static Word createWord(final Category category, final String vocabulary, final String meaning,
                                  final int clickCount) {
        return Word.builder()
                .category(category)
                .vocabulary(vocabulary)
                .meaning(meaning)
                .clickCount(0)
                .build();
    }
}
