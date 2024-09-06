package MentorDay28.task_1;

public class CacheMain {
    public static void main(String[] args) {
        Cache<Integer, String> stringCache = new Cache<>();
        stringCache.add(19, "Zeka");
        stringCache.add(20, "Kemal");

        System.out.println("String Cache");
        stringCache.displayCache();

        System.out.println("\nGet method");
        String value = stringCache.get(20);
        System.out.println(value);

        System.out.println("\nAfter removing");
        stringCache.remove(19);
        stringCache.displayCache();

        System.out.println("\nContains key 1: " + stringCache.containsKey(1));
        System.out.println("Contains key 2: " + stringCache.containsKey(20));

        Cache<String, String> players = new Cache<>();
        players.add("Michael Jordan", "Brooklyn, New York, ABŞ");
        players.add("Kobe Bryant", "Philadelphia, Pennsylvania, ABŞ");
        players.add("Tim Duncan", "Christiansted, U.S. Virgin Islands");

        System.out.println("players cache:");
        players.displayCache();

    }
}
