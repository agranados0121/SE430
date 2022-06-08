package team14.ourHotel.Hotel;

import java.util.ArrayList;
import java.util.HashMap;

import team14.ourHotel.Users.Customer;

public class Hotel {
    ArrayList<Room> rooms;//Represents all rooms, booked or not
    HashMap<Customer,Room> bkrooms;//Represents ONLY booked rooms
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public Hotel(ArrayList<Room> rooms, HashMap<Customer, Room> bkrooms) {
        this.rooms = rooms;
        this.bkrooms = bkrooms;
    }
    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public HashMap<Customer,Room> getBkrooms() {
        return bkrooms;
    }
    public void setBkrooms(HashMap<Customer, Room> bkrooms) {
        this.bkrooms = bkrooms;
    }
    public void BookRoom(Room r, Customer c){
        if(bkrooms.values().contains(r)){
            System.out.println("This room is already booked by a different Customer");
            return;
        }
        else{
            bkrooms.put(c,r);
        }
    }
    public void releaseRoom(Customer c){
        bkrooms.remove(c);
    }
}
