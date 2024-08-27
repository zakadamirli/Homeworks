package Lesson_25.Normal_level.Task_2;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
