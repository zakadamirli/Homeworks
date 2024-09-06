package MentorDay28.task_1;

import java.util.HashMap;
import java.util.Map;

public class Cache<K, V> {
    private final Map<K, V> cacheMap;

    public Cache() {
        this.cacheMap = new HashMap<>();
    }

    public void add(K key, V value) {
        cacheMap.put(key, value);
    }

    public V get(K key) {
        return cacheMap.get(key);
    }

    public void remove(K key) {
        cacheMap.remove(key);
    }

    public boolean containsKey(K key) {
        if (!cacheMap.containsKey(key)) {
            System.out.println("not found");
            return false;
        }
        return cacheMap.containsKey(key);
    }

    public void displayCache() {
        cacheMap.entrySet().stream().map(entry -> "Key: " + entry.getKey() +
                ", Value: " + entry.getValue()).forEach(System.out::println);
    }
}