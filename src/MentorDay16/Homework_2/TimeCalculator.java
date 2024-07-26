package MentorDay16.Homework_2;

public class TimeCalculator {
    public void calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        System.out.println("There is " + Math.abs((hour1 * 60 + minute1 - (hour2 * 60 + minute2)) / 60) + " hour " + Math.abs((hour1 * 60 + minute1 - (hour2 * 60 + minute2)) % 60) + " minutes difference");
    }

    public static void main(String[] args) {
        System.out.println("INFO: Enter hour 0-24 and minute 0-60");
        TimeCalculator obj = new TimeCalculator();
        obj.calculateDifference(12, 45, 7, 50);
        obj.calculateDifference(1, 0, 2, 0);
        obj.calculateDifference(15, 0, 1, 0);
    }
}
