package MentorDay23.Movie_Ticket_Booking_System;

public enum MovieType {
    ACTION(10),
    COMEDY(8),
    DRAMA(15),
    HORROR(20),
    ANIMATION(5);

    private double price;

    MovieType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
