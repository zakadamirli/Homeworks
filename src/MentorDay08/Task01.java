package MentorDay08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Pls enter the array length");
        int arrayLength=sc.nextInt();
        int[] array=new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Zehmet olmasa "+i+ " ci elementi daxil edin: ");
            array[i]=sc.nextInt();
        }

        max=array[0];
        for (int i = 0; i < arrayLength; i++) {
            if (array[i]>=max) {
                max=array[i];
            }
        }
        System.out.println("Maximum: "+max);

        min=array[0];
        for (int i=0;i<arrayLength;i++){

            if (array[i]<=min){
                min=array[i];
            }
        }
        System.out.println("Minimum: "+min);
    }
}
