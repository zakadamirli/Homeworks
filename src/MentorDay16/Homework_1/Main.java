package MentorDay16.Homework_1;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon();
        sword.attack();
        sword.attack(30);
        sword.attack(1.3);
        sword.attack("Blade Fury");

        Weapon bow = new Weapon();
        bow.attack();
        bow.attack(5);
        bow.attack(2.0);
        bow.attack("Arrow Barrage");
    }
}
