package MentorDay23.Movie_Ticket_Booking_System;

import java.util.Scanner;

public class Booking {
    public static Ticket[] tickets;
    static Scanner sc = new Scanner(System.in);
    static double totalPrice = 0;

    public void toBooking() {
        System.out.println("Enter ticket count: ");
        int tCount = sc.nextInt();
        sc.nextLine();
        tickets = new Ticket[tCount];
        for (int i = 0; i < tCount; i++) {
            Ticket ticket;
            ticket = new Ticket();
            System.out.println("Enter Movie type:");
            ticket.setMovieType(MovieType.valueOf(sc.nextLine().toUpperCase()));
            System.out.println("Enter Seat type:");
            ticket.setSeatType(SeatType.valueOf(sc.nextLine().toUpperCase()));
            tickets[i] = ticket;
        }
        System.out.println("Print all booking with prices: ");
        for (Ticket t : tickets) {
            System.out.print(t + " ");
            System.out.println(t.calculateTotalPrice());
            totalPrice += t.calculateTotalPrice();
        }
        System.out.println("Total booking price: " + totalPrice);

        System.out.println("Do you want to add concession items?");
        String choose = sc.next();
        if (choose.equalsIgnoreCase("no")) return;
        System.out.println("""
                1. POPCORN\s
                2. SODA
                3. CANDY""");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                totalPrice += ConcessionItem.POPCORN.getPrice();
                break;
            case 2:
                totalPrice += ConcessionItem.SODA.getPrice();
                break;
            case 3:
                totalPrice += ConcessionItem.CANDY.getPrice();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
        System.out.println("Added price, total price: " + totalPrice);

    }

}
