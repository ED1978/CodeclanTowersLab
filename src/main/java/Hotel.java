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
}
