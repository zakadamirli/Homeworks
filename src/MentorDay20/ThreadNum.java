package MentorDay20;

public class ThreadNum extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
