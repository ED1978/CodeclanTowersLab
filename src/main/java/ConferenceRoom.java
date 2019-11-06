import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int guestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        if(hasCapacity() == true){
            this.guests.add(guest);
        }
    }

    public boolean hasCapacity(){
        if (guestCount() < this.capacity){
            return true;
        } else {
            return false;
        }
    }

}
