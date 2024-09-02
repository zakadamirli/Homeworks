package MentorDay27.task_1;

import java.util.*;

public class MovieStream {
    private String title;
    private String genre;

    public MovieStream(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public static void main(String[] args) {
        List<MovieStream> list = new ArrayList<>();
        list.add(new MovieStream("The ShawShank Redemption", "Drama"));
        list.add(new MovieStream("Inception", "Sci-Fi"));
        list.add(new MovieStream("The Dark Knight", "Action"));
        list.add(new MovieStream("Pulp Fiction", "Crime"));
        list.add(new MovieStream("Fight Club", "Drama"));
        list.add(new MovieStream("The Matrix", "Sci-Fi"));
        list.add(new MovieStream("GoodFellas", "Crime"));
        System.out.println("Original list: \n");
        list.forEach(System.out::println);

        List<String> district = list.stream()
                .map(MovieStream::getGenre)
                .distinct()
                .sorted()
                .toList();
        System.out.println("\nDistinct list : \n");
        district.forEach(System.out::println);


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "MovieStream{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
