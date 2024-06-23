package Lesson_6;


public class LoopNL {
    public static void main(String[] args) {
        FibNum();
        }


    // 1. calculate the sum of all even numbers
    public static int EvenNum(){
        int i=0;
        int sum=0;
        while(i<101){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
    //2. Do -while loop
    public static void DoWhile(){
        int battery=80;
        do {
            System.out.println("Battery status: "+battery);
            battery--;
        }while (battery>50);
    }

    //3. Fibonacci numbers
    public static void FibNum(){
        int[]arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<10;i++){
            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
    }

    //4. Break Statement
    public static void BreFun(){
        int[]arr=new int[30];
        arr[0]=0;
        arr[1]=1;
        System.out.print(arr[0]+" "+arr[1]+" ");
        for(int i=2;i<30;i++){
            arr[i]=arr[i-1]+arr[i-2];
            if (i==10){
                break;
            }
            System.out.print(arr[i]+" ");
        }
    }
    //5. Continue Statement
    public static void ConFun(){
        for (int i = 1; i < 21; i++) {
            if(i%3==0){
                continue;
            }
            System.out.println("indivisible: "+i);
        }
    }
}
