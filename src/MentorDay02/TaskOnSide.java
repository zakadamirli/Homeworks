package MentorDay02;

import java.util.Scanner;

public class TaskOnSide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            System.out.println("0 ve 100 arasinda eded daxil edin: ");
            int eded = sc.nextInt();

            if (eded > 0 && eded < 100) {
                if (eded % 2 == 0) {
                    System.out.println("eded cutdur");
                } else {
                    System.out.println("eded tekdir");
                }
                return;
            } else {

                System.out.println("eded yalnishdir yeniden daxil edin");
                System.out.println();
                i++;
            }

        }
    }
}
