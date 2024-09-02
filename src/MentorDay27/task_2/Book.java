package MentorDay27.task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("To Kill a Mockingbird", "Harper Lee", 1960),
                new Book("1984", "George Orwell", 1949),
                new Book("Pride and Prejudice", "Jane Austen", 1813),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                new Book("The Catcher in the Rye", "J.D. Salinger", 1951),
                new Book("The Hobbit", "J.R.R. Tolkien", 1937)
        );
        books.forEach(System.out::println);

        Optional<Book> book = books.stream()
                .max(Comparator.comparingInt(Book::getYear));
        if (book.isPresent()) {
            System.out.println("\nLatest published book: " + book.get().getTitle());
        } else {
            System.out.println("No books found.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
