package Lesson_3;

import java.util.Scanner;

public class TaskNormal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int intNum=sc.nextInt();
        if(intNum>10){
            System.out.println("negation: "+(-intNum));
        } else{
            System.out.println("original: "+intNum);
        }
        if(intNum%2==0){
            System.out.println("it's even");
        }else {
            System.out.println("it's odd ");
        }
        System.out.println("enter a decimal number: ");
        double decNum=sc.nextDouble();
        System.out.println("sum: "+ decNum+ intNum);

        int rand= (int)(Math.random()*10);
        int result= intNum+rand;

        if(result>20){
            System.out.println("it's larger than 20");
        }else {
            System.out.println("it's not larger than 20");
        }

    }
}
