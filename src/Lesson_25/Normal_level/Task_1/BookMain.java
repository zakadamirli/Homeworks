package Lesson_25.Normal_level.Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Moby Dick", "Herman Melville", 1851));
        books.add(new Book("Pride and Prejudice", "Jane Austen", 1813));

        Collections.sort(books);
        System.out.println("Books sorted by title");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
