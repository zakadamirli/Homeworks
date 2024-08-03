package Lesson_18.NormalLevel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Participant {
    private String name;
    private int age;
    private String email;

    public Participant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayParticipants() {
        try {
            FileReader fileReader = new FileReader("/Users/Veli/Display/participants.txt");
            System.out.println("Message read to file successfully!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void registerUsers(String name, int age, String email) {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }
}
