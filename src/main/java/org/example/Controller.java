package org.example;

import models.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/bookstore")
public class Controller {
    List<String> books = Arrays.asList("Sherlock Holmes", "Arsene Lupin", "Code da Vinci");

    @GetMapping()
    public BookList bookList(){
        return new BookList(books);
    }

    //@PostMapping("/postNewBook")

}