package team14.ourHotel.Hotel;

import java.util.ArrayList;
import java.util.HashMap;

import team14.ourHotel.Users.Customer;

public class Hotel {
    ArrayList<Room> rooms;//Represents all rooms, booked or not
    HashMap<Room,Customer> bkrooms;//Represents ONLY booked rooms
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public Hotel(ArrayList<Room> rooms, HashMap<Room, Customer> bkrooms) {
        this.rooms = rooms;
        this.bkrooms = bkrooms;
    }
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public HashMap<Room, Customer> getBkrooms() {
        return bkrooms;
    }
    public void setBkrooms(HashMap<Room, Customer> bkrooms) {
        this.bkrooms = bkrooms;
    }
    public void BookRoom(Room r, Customer c){
        if(bkrooms.containsKey(r)){
            System.out.println("This room is already booked by a different Customer");
            return;
        }
        else{
            bkrooms.put(r, c);
        }
    }
    public void releaseRoom(Room r, Customer c){
        bkrooms.remove(r,c);
    }
}
