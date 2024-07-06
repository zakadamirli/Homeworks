package Lesson_10;

public class Author {

    public String name;
    public int birthYear;

    @Override
    public String toString() {
        return "Author: " +
                name +
                " ( Birth Year: " + birthYear + " )";
    }
    public Author(){
    }

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }


}
