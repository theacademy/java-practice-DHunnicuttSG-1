package org.example.Day3.BookExample;

import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private List<Author> authors;
    private Publisher publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\ntitle='" + title + "\n" +
                "isbn='" + isbn + "\n" +
                "authors=" + Arrays.toString(new List[]{authors}) +
                "publisher=" + publisher +
                "}\n";
    }
}
