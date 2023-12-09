package org.example;

import models.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/bookstore")
public class Controller {
    List<String> books = new ArrayList<>(Arrays.asList("Sherlock Holmes", "Arsene Lupin", "Code da Vinci"));


    @GetMapping("/books")
    public BookList bookList(){
        return new BookList(books);
    }

    @PostMapping("/NewBook")
    public String newBook(@RequestParam(value = "book") String book){
        books.add(book);
        return "New book added successfully";
    }

}