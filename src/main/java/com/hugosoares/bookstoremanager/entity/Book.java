package com.hugosoares.bookstoremanager.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data // Adiciona Geters e Sters
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int pages;

    @Column(nullable = false)
    private int chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publischer_name", nullable = false, unique = true)
    private String publischerName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE} ) //Indica mapeamento de muitos para um
    @JoinColumn(name = "author_id") // Qual coluna faz o relacionamento
    private Author author;

}
