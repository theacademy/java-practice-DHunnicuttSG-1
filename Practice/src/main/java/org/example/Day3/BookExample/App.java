package org.example.Day3.BookExample;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbn("4567891235");
        Publisher publisher = new Publisher();

        publisher.setName("Wiley");
        Address A1 = new Address("111 River Street","Hoboken","NJ","07030");
        publisher.setAddress(A1);

        book.setTitle("Testing Composition");
        book.setPublisher(publisher);

        List<Author> authors = new ArrayList<>();
        Author author1 = new Author();
        author1.setFirstName("Jim");
        author1.setLastName("Saxby");
        Address A2 = new Address("12 Hammersmith Grove","London","UK","W6 7AL");
        author1.setAddress(A2);

        Author author2 = new Author();
        author2.setFirstName("Ben");
        author2.setLastName("Jones");
        Address A3 = new Address("12 Hammersmith Grove","London","UK","W6 7AL");
        author2.setAddress(A3);

        Author author3 = new Author();
        author3.setFirstName("Javeria");
        author3.setLastName("Khan");
        Address A4 = new Address("12 Hammersmith Grove","London","UK","W6 7AL");
        author3.setAddress(A4);

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        book.setAuthors(authors);

        System.out.println(book);
    }
}
