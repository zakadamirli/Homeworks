package MentorDay07;

public class FirstPatternPre {
    public static void main(String[] args) {
        int starCount=9;
        for(int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=starCount;k>2*i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
