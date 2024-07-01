package MentorDay09;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowCount = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columnCount = sc.nextInt();
        int[][] intArray = new int[rowCount][columnCount];
        System.out.println("Enter the elements of array: ");
        int biggestNum = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                intArray[i][j] = sc.nextInt();
                if (intArray[i][j] > biggestNum) {
                    biggestNum = intArray[i][j];
                }
            }
        }
        System.out.println("The biggest element: " + biggestNum);
    }
}
