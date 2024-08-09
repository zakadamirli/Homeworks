package MentorDay20;

public class PrintTread {
    public static void main(String[] args) {
        ThreadNum threadNum = new ThreadNum();
        ThreadLetter threadLetter = new ThreadLetter();

//        try {
//            threadNum.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        threadNum.start();
        threadLetter.start();


    }
}
