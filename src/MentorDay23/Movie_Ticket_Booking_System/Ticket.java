package MentorDay23.Movie_Ticket_Booking_System;

public class Ticket {
    private MovieType movieType;
    private SeatType seatType;

    public double calculateTotalPrice() {
        return (movieType.getPrice() + seatType.getPrice());
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "movieType=" + movieType +
                ", seatType=" + seatType +
                '}';
    }
}
