package team14.ourHotel;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import team14.ourHotel.Hotel.Hotel;
import team14.ourHotel.Hotel.Room;
import team14.ourHotel.Users.Customer;
import team14.ourHotel.Users.Manager;

@SpringBootApplication
public class OurHotelApplication {
	public static int cust = 1;
	public static int mang = 1;
	public static int rm = 1;
	public static void main(String[] args) {
		Customer c1 = new Customer("John", "Smith","jsmith@gmail.com","jsmith","password");
		Customer c2 = new Customer("Jane", "Doe","jdoe@gmail.com","jdoe","password");
		Customer c3 = new Customer("Alex", "Ben","aben@gmail.com","aben","password");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(c1);customers.add(c2);customers.add(c3);
		Room r1 = new Room(true, 3, 2, "King", false);
		Room r2 = new Room(false, 2,1,"Queen",false);
		Room r3 = new Room(false, 1,1,"Twin",true);
		Room r4 = new Room(true, 4, 2, "King", false);
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(r1); rooms.add(r2);rooms.add(r3);rooms.add(r4);
		HashMap<Room,Customer>bk = new HashMap<Room,Customer>();
		bk.put(r2, c2);bk.put(r3,c3);
		ArrayList<Manager> mg = new ArrayList<Manager>();
		mg.add(new Manager("Joe", "Billy", "jbilly@outlook.com", "jbilly", "password"));
		Hotel h = new Hotel(rooms, bk);


		SpringApplication.run(OurHotelApplication.class, args);
		
	}

}
