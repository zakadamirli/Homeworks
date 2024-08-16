package MentorDay22.Enum_Based_Book_Store_System;

public class BookStoreApp {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        bookStore.addBook(BookCategory.HISTORY);
        bookStore.addBook(BookCategory.FANTASY);
        bookStore.addBook(BookCategory.FICTION);


        bookStore.printAllBooks();
        System.out.println("Find Book: ");
        bookStore.findBookByCt(BookCategory.FANTASY);
        System.out.println(BookCategory.FANTASY.getDescription());
    }
}
