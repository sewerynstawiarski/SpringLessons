package com.SpringBootCourse.SpringBootLessons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Books> getAllBooks() {
        return Arrays.asList(new Books(1,"Woda jest dnem", "KeveS"), new Books(2,"Harda", "Katarzyna Cherezińska"),
                new Books(3,"Czarny Pryzmat", "Brent Weeks"));
    }
}
