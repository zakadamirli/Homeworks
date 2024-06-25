package Lesson_7;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]array=new String[5];
        System.out.println("------------------------------------");
        System.out.println("Enter the products you want to buy:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"-st/nd/rd/th product: ");
            String product=sc.next();
            array[i]=product;
        }
        System.out.println("Grocery list:  ");
        for(String s:array){
            System.out.println(s);
        }
    }
}
