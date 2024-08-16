package MentorDay22.Enum_Based_Book_Store_System;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Book> books = new ArrayList<>();

    public static Book fillBooks(BookCategory category) {
        System.out.println("Enter title: ");
        String title = sc.nextLine();
        System.out.println("Enter author name: ");
        String author = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        return new Book(title, author, category, price);
    }

    public void addBook(BookCategory category) {
        Book newBook = fillBooks(category);
        books.add(newBook);
    }

    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void findBookByCt(BookCategory ct) {
        for (Book b : books) {
            if (b.getCategory() == ct) {
                System.out.println(b);
            }
        }
    }

}
