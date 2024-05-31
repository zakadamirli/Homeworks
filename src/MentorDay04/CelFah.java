package MentorDay04;

import java.util.Scanner;

public class CelFah {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Choose between Celsius (C) or Fahrenheit (F)");
        char tempUnit=sc.next().toUpperCase().charAt(0);
        System.out.println("enter the temperature value");
        double value=sc.nextDouble();
        switch (tempUnit){
            case 'C':
                System.out.println(value+"C"+ ","+ "F= "+((value*9/5)+32));
                System.out.println();
                break;
            case 'F':
                System.out.println(value+"F"+","+"C= "+((value-32)*5/9));
                break;
            default:
                System.out.println("Error");
        }

    }
}
