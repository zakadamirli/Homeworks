package MentorDay16.Homework_1;

public class Weapon {
    public void attack() {
        System.out.println("Performing a basic attack");
    }

    public void attack(int damage) {
        System.out.println("Performing a regular attack with " + damage + "damage");
    }

    public void attack(double criticalMultiplier) {
        System.out.println("Performing a critical attack with a damage multiplier of " + criticalMultiplier);
    }

    public void attack(String specialMove) {
        System.out.println("Performing a special attack: " + specialMove);
    }
}
