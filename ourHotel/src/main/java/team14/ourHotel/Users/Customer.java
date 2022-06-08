package team14.ourHotel.Users;

import team14.ourHotel.OurHotelApplication;
import team14.ourHotel.Hotel.Hotel;
import team14.ourHotel.Hotel.Room;

public class Customer implements User {
    int id;
    String fname;
    String lname;
    String email;
    String username;
    String password;
    
    public Customer(String fname, String lname, String email, String username, String password) {
        this.id=OurHotelApplication.cust++;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public int getId() {
        return id;
    }
   
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void requestRoom(Hotel h, int i){
        //Room 1 is in index 0 thus -1 in function
        Room r= h.getRooms().get(i-1);
        h.BookRoom(r, this);
    }
    
}
