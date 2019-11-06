import java.util.ArrayList;

public class Bedroom {

    private String roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(String roomNumber, int capacity, String type)
    {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int guestCount(){
        return this.guests.size();
    }

    public boolean hasEnoughCapacity(){
        if (guestCount() < this.capacity){
            return true;
            } else {
            return false;
        }
    }

    public void addGuest(Guest guest){
        if(hasEnoughCapacity() == true){
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest){
        int index = this.guests.indexOf(guest);
        Guest foundGuest = this.guests.remove(index);
    }

}
