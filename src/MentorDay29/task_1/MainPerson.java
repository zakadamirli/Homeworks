package MentorDay29.task_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 34, "New York"));
        personList.add(new Person("Alice", 30, "Los Angeles"));
        personList.add(new Person("Bob", 22, "Chicago"));
        personList.add(new Person("Carol", 28, "Houston"));
        personList.add(new Person("David", 35, "Miami"));
        personList.add(new Person("Eve", 29, "San Francisco"));
        personList.add(new Person("Alice", 27, "Austin"));
        personList.add(new Person("Grace", 24, "Boston"));
        personList.add(new Person("Hank", 31, "Miami"));
        personList.add(new Person("Ivy", 26, "Denver"));

        System.out.println("Filter a");
        Stream<Person> personStream = personList.stream().filter(person -> person.getAge() < 30);
        personStream.forEach(System.out::println);

        System.out.println("\nSort b");
        personList.stream().sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);

        System.out.println("\nMap c");
        personList.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println("\nCount d");
        System.out.println(personList.stream().filter(person -> person.getCity()
                .equals("Miami")).count());

        System.out.println("\nCollect e");
        Set<String> stringSet = personList.stream()
                .filter(person -> person.getAge() > 25)
                .map(Person::getName)
                .collect(Collectors.toSet());
        stringSet.forEach(System.out::println);

    }
}
