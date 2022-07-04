package simple_api.simple.controlers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import simple_api.simple.models.BookModel;
import simple_api.simple.repositories.BookRepository;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/Books")
    public List<BookModel> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping("/Books")
    public BookModel saveBook(@RequestBody BookModel bookModel) {
        return bookRepository.save(bookModel);
    }
}
