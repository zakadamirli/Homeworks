package MentorDay29.task_2;

import java.util.*;

public class MovieRatingSystem {
    Map<String, Map<String, Integer>> resMap;

    public MovieRatingSystem() {
        this.resMap = new HashMap<>();
    }

    public void addRating(String user, String movie, int rating) {
        resMap.putIfAbsent(user, new HashMap<>());
        resMap.get(user).put(movie, rating);
    }

    public Map<String, Integer> getUserRatings(String user) {
        return resMap.getOrDefault(user, Collections.emptyMap());
    }

    public double getAverageRating(String movie) {
        int totalRating = 0;
        int count = 0;
        for (Map<String, Integer> rating : resMap.values()) {
            if (rating.containsKey(movie)) {
                totalRating += rating.get(movie);
                count++;
            }
        }
        return count == 0 ? 0 : (double) totalRating / count;
    }

    public List<String> getTopRatedMovies() {
        Map<String, Double> movieAverage = new HashMap<>();
        for (Map<String, Integer> ratings : resMap.values()) {
            for (Map.Entry<String, Integer> entry : ratings.entrySet()) {
                String movie = entry.getKey();
                movieAverage.put(movie, getAverageRating(movie));
            }
        }
        List<String> topRatingMovies = new ArrayList<>(movieAverage.keySet());
        topRatingMovies.sort((m1, m2) -> Double.compare(movieAverage.get(m2), movieAverage.get(m1)));
        return topRatingMovies;
    }

    public void displayAllRatings() {
        for (Map.Entry<String, Map<String, Integer>> entry : resMap.entrySet()) {
            System.out.println(entry.getKey() + "'s ratings " + entry.getValue());
        }
    }
}
