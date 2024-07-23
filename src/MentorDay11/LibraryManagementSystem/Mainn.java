package MentorDay11.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Mainn {


    public static void main(String[] args) {


        Book book = new Book("12122", "Cinayet ve ceza", "Dostayevski", "Qanun", 1987, 25000);
        Book book2 = new Book("12123", "NDOICOC", "ADScae", "Publish", 1891, 70000);

//        System.out.println(book);
        Library library = new Library("F.Akunzade", "012fr");
//        Library library2=new Library("F.Akunzade","012fr", book);
//        System.out.println(library);
//        library.removeBook("12122");


        library.addBook(book);
        library.addBook(book2);

        System.out.println(library);
//        System.out.println(library2);
        System.out.println("find book");
        System.out.println(library.findBook("12122"));

//        library.print();


    }
}
