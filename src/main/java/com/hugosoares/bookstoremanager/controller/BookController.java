package com.hugosoares.bookstoremanager.controller;

import com.hugosoares.bookstoremanager.dto.MessageResponseDTO;
import com.hugosoares.bookstoremanager.entity.Book;
import com.hugosoares.bookstoremanager.repository.BookRepository;
import com.hugosoares.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica para o Spring que esta classe representa um controller
@RequestMapping("/api/v1/books") // Indica o endpoit onde sera feito o acesso ao controller
public class BookController {

    private BookService bookService;

    @Autowired // Injenção de independencia
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // DTO -> Objeto de transferencia de dados
    @PostMapping // Operação tipo POST
    public MessageResponseDTO create(@RequestBody Book book){
        return bookService.create(book);
    }

}
