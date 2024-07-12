package MentorDay12.HotelReserSys;

import java.util.ArrayList;

public class Hotel {
    ArrayList <Room> rooms=new ArrayList<>();


    public void add(Room room){
        rooms.add(room);
    }


    public void bookRoom(String roomNumber){
        for (Room room:rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                Room.isBooked=true;
                break;
            }
        }
    }


    public void cancelBook(String roomNumber){
        for (Room room:rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                Room.isBooked=false;
                break;
            }
        }
    }

    public Room findRoom(String roomNumber){
        for (Room room:rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room;
            }
        }
        return null;
    }

    public ArrayList<Room> listAllRoom(){
        return rooms;
    }
}
