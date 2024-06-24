package MentorDay07;
//day06 homework
public class FirstPattern {
    public static void main(String[] args) {
        /* Task 1
        ********* 9
         *******  7
          *****   5
           ***    3
            *     1
         */
        int lineCount=5;
        for (int i = 1; i < lineCount+1; i++) { //1
            for (int z = 0; z < i-1; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*lineCount+1-(2*i) ; j++) { //i=2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
