package com.hugosoares.bookstoremanager.service;

import com.hugosoares.bookstoremanager.dto.MessageResponseDTO;
import com.hugosoares.bookstoremanager.entity.Book;
import com.hugosoares.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service // Gerenciada pelo Spring e tera outros serviços que podem ser injetados
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // DTO -> Objeto de transferencia de dados
    @PostMapping // Operação tipo POST
    public MessageResponseDTO create(Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + savedBook.getId())
                .build();
    }

}
