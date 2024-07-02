package Lesson_8;

import java.util.Scanner;

public class CarInventory {
    private static final String[][] carGarage = new String[5][3];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        carGarage[0] = new String[]{"BMW ", " X5", " Black"};
        carGarage[1] = new String[]{"BMW ", " X7", " Blue"};
        carGarage[2] = new String[]{"BMW ", " X6", " White"};

        displayGarage();
        addCarToGarage();
        displayGarage();

    }

    public static void displayGarage() {
        System.out.println("Current state of the car garage:");
        for (String[] row : carGarage) {
            for (String car : row) {
                System.out.print(car);
            }
            System.out.println();
        }
    }

    public static void addCarToGarage() {
        System.out.println("Enter details of the new car:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (carGarage[i][j] == null) {
                    if (j == 0) {
                        System.out.print("Name: ");
                    }
                    if (j == 1) {
                        System.out.print("Model: ");
                    }
                    if (j == 2) {
                        System.out.print("Color: ");
                    }

                    carGarage[i][j] = sc.next() + " ";
                }
            }
        }
    }
}
