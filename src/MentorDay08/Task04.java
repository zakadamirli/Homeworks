package MentorDay08;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the array length");
        int arrayLength=sc.nextInt();
        int []array=new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Zehmet olmasa "+i+ " ci elementi daxil edin: ");
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int targetValue=sc.nextInt();
        for (int i = 0; i < arrayLength; i++) {
            if (array[i]==targetValue){
                System.out.println("Target value found at index: "+i);
            }
        }
    }
}
