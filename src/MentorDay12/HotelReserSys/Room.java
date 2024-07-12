package MentorDay12.HotelReserSys;

public class Room {
    String roomNumber;
    String type;
    static boolean isBooked;
    public Room(String roomNumber,String type,boolean isBooked){
        this.roomNumber=roomNumber;
        this.type=type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public void displayInfo(){
        System.out.println("Room Number: "+roomNumber);
        System.out.println("Type: "+type);
        System.out.println("Is booked: "+isBooked);
    }
    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", type='" + type + '\'' +
                ", isBooked=" + isBooked +
                '}';
    }
}
