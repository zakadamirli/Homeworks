package Lesson_10;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Fyodor Dostoevsky",1821);
        Author author2 = new Author("George Orwell",1903);
        Author author3 = new Author("Harper Lee",1926);

        Book book1 = new Book("Crime and Punishment",author1,1866);
        Book book2 = new Book("1984",author2,1949);
        Book book3 = new Book("To Kill a Mockingbird",author3,1960);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);
        System.out.println(book3);


    }
}