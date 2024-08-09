package MentorDay20;

public class ThreadLetter extends Thread {
    @Override
    public void run() {
        try {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.print(c);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
