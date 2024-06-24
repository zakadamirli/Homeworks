package MentorDay07;
//day06 homework
public class SecondPattern {
    public static void main(String[] args) {
        /*
*****
 ****
  ***
   **
    *
         */
        int lineCount=5;
        for (int i = 1; i < lineCount+1; i++) {
            for (int z = 0; z < i-1; z++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*lineCount-i-4 ; j++) { //i=2
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
