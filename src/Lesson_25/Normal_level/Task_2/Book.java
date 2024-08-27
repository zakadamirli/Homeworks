package Lesson_25.Normal_level.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("A 1984", "B George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", "A Harper Lee", 1960));
        books.add(new Book("B The Great Gatsby", "F. Scott Fitzgerald", 1925));
        books.add(new Book("Moby Dick", "D Herman Melville", 1851));
        books.add(new Book("A Pride and Prejudice", "A Jane Austen", 1813));

        Collections.sort(books, new BookTitleComparator());
        for (Book b : books) {
            System.out.println(b);
        }

        System.out.println("\n");

        Collections.sort(books, new BookAuthorComparator());
        for (Book b : books) {
            System.out.println(b);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}
