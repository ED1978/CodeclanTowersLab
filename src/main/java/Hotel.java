import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ConferenceRoom conferenceRooms ){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom){
        bedroom.removeGuest(guest);
    }
}
