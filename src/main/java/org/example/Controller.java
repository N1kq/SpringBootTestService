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

    @PostMapping("/AddBook")
    public String newBook(@RequestBody String book){
        books.add(book);
        return "New book added successfully";
    }

    @DeleteMapping("/DeleteBook/{id}")
    public void delById(@PathVariable("id")int id){
        books.remove(id);
    }
}