package MentorDay23.Movie_Ticket_Booking_System;

public enum ConcessionItem {
    POPCORN(5),
    SODA(2),
    CANDY(3);
    private double price;

    ConcessionItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
