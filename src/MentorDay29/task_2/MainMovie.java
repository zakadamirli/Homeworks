package MentorDay29.task_2;

public class MainMovie {
    public static void main(String[] args) {
        MovieRatingSystem system = new MovieRatingSystem();
        system.addRating("Alice", "Inception", 5);
        system.addRating("Bob", "Inception", 4);
        system.addRating("Alice", "The Matrix", 3);

        System.out.println("Alice's rating " + system.getUserRatings("Alice"));

        System.out.println("Average rating : Inception " + system.getAverageRating("Inception"));

        System.out.println("Top rated " + system.getTopRatedMovies());

        system.displayAllRatings();
    }
}
