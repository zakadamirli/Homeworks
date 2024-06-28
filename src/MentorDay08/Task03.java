package MentorDay08;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the array length");
        int arrayLength=sc.nextInt();
        int[] array=new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Zehmet olmasa "+i+ " ci elementi daxil edin: ");
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            sum+=array[i];
        }
        double average=(double) sum/arrayLength;
        System.out.println("Average value of the array elements is : "+average);
    }
}
