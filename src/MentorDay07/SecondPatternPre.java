package MentorDay07;

public class SecondPatternPre {
    public static void main(String[] args) {
        int starCountS=5;
        for (int i = 0; i < starCountS; i++) {
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k = starCountS; k >i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
