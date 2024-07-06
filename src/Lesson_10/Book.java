package Lesson_10;

public class Book {

    public String title;
    public Author author;
    public int publicationYear;

    @Override
    public String toString() {
        return "Book: " +
                title +
                " ( Author: " + author.name +
                ", Publication Year: " + publicationYear + " )";
    }

    public Book(){

    }

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
