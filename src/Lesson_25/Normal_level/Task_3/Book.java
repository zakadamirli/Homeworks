package Lesson_25.Normal_level.Task_3;

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
        books.add(new Book("Java Programming", "A John Smith", 2022));
        books.add(new Book("C Programming", "Alice Johnson", 2023));
        books.add(new Book("Python Programming", "Mary Brown", 2021));
        books.add(new Book("Java Programming", "Robert Davis", 2024));
        Collections.sort(books, new BookTitleAuthorComparator());
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
