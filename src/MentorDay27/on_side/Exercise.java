package MentorDay27.on_side;

import java.util.HashSet;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        System.out.println("set 1: " + set1);
        System.out.println("set 2: " + set2);
        System.out.println("Union:");
        union(set1, set2);
        System.out.println("Intersection:");
        intersection(set1, set2);
        System.out.println("Non-intersection: ");
        nonIntersecting(set1, set2);

    }

    public static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);
        System.out.println(set);
    }

    public static void intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : set1) {
            if (set2.contains(i)) {
                set.add(i);
            }
        }
        System.out.println(set);
    }

    public static void nonIntersecting(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                set.add(i);
            }
        }
        for (Integer i : set2) {
            if (!set1.contains(i)) {
                set.add(i);
            }
        }
        System.out.println(set);
    }
}
