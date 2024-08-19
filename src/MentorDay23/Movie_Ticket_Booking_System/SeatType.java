package MentorDay23.Movie_Ticket_Booking_System;

public enum SeatType {
    STANDARD(5),
    PREMIUM(10),
    VIP(20);
    private double price;

    SeatType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
