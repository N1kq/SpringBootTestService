package models;
import java.util.List;

public class BookList {
    private List<String> books;

    public List<String> getBooks() {
        return books;
    }

    public BookList(List<String> books) {
        this.books = books;
    }
}
