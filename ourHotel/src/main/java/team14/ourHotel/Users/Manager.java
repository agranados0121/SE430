package team14.ourHotel.Users;

import team14.ourHotel.OurHotelApplication;
import team14.ourHotel.Hotel.Hotel;

public class Manager implements User{
    int id;
    String fname;
    String lname;
    String email;
    String username;
    String password;
    public Manager(String fname, String lname, String email, String username, String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.id = OurHotelApplication.mang++;
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
    public void cancel(Hotel h, Customer c) {
        h.releaseRoom(c);
    }
}
