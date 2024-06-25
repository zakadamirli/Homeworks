package MentorDay07;

import java.util.Random;

//onside mentor task
public class ArrayTAsk {
    public static void main(String[] args) {
        int []array=new int[10];
        Random rand=new Random();
        int sum=0;
        for(int i=0;i<10;i++){
            int rand_num = rand.nextInt(100);
            array[i]= rand_num;
            sum+=rand_num;
        }

        for(int s:array){
            System.out.println(s);
        }

        System.out.println("sum: "+sum);
        double average=(double) sum/10;
        System.out.println("Average: "+average);

    }
}
