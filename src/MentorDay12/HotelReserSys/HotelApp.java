package MentorDay12.HotelReserSys;

import java.util.Scanner;

public class HotelApp {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Hotel hotel=new Hotel();
        hotel.add(new Room("111","Double Room",false)); //two people
        hotel.add(new Room("112","Quad Room",false)); //four people
        hotel.add(new Room("113","Triple Room",false)); //three people
        System.out.println(hotel.listAllRoom());
        hotel.bookRoom("111");
        System.out.println(hotel.listAllRoom());
        hotel.cancelBook("111");
        System.out.println(hotel.listAllRoom());
    }
}
