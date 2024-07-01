package MentorDay09;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many books would you like to add? ");
        int ArraySize=sc.nextInt();
        String[][] array =new String[ArraySize][2];
        for (int i=0;i< ArraySize;i++){
            System.out.print((i+1)+" Book name: ");
            array[i][0]=sc.next();
            System.out.print((i+1)+" Author name: ");
            array[i][1]=sc.next();
            sc.nextLine();
        }
        System.out.println();
        for (String[] strings : array) {
            System.out.println("Book Name: " + strings[0]);
            System.out.println("Author Name: " + strings[1]);
            System.out.println();
        }
        }
    }
