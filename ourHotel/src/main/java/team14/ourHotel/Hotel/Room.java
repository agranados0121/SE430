package team14.ourHotel.Hotel;

public class Room {
    int id;
    boolean available;
    int maxOccupants;
    int bedAmt;
    String bedSizes;
    boolean smoking;
    public Room(boolean available, int maxOccupants, int bedAmt, String bedSizes, boolean smoking) {
        this.available = available;
        this.maxOccupants = maxOccupants;
        this.bedAmt = bedAmt;
        this.bedSizes = bedSizes;
        this.smoking = smoking;
    }
    public int getId(){
        return this.id;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public int getMaxOccupants() {
        return maxOccupants;
    }
    public void setMaxOccupants(int maxOccupants) {
        this.maxOccupants = maxOccupants;
    }
    public int getBedAmt() {
        return bedAmt;
    }
    public void setBedAmt(int bedAmt) {
        this.bedAmt = bedAmt;
    }
    public String getBedSizes() {
        return bedSizes;
    }
    public void setBedSizes(String bedSizes) {
        this.bedSizes = bedSizes;
    }
    public boolean isSmoking() {
        return smoking;
    }
    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
    public String description(){
        StringBuilder sb = new StringBuilder();
        sb.append("This room is currently ");
        if(isAvailable() == true){sb.append("available to rent.");}else{sb.append("not available to rent.");}
        sb.append("This room can hold a max of "+getMaxOccupants()+" people. \n");
        sb.append("This room has "+getBedAmt()+" and they are "+getBedSizes()+ " beds");
        if(isSmoking() == true){sb.append("\nYou are allowed to smoke in this room");}else{sb.append("\n You are NOT allowed to smoke in this room");}
        return sb.toString();
    }
}
