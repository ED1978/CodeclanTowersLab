import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Bedroom bedroom4;
    private Bedroom bedroom5;
    private ConferenceRoom conferenceRoom;
    private ArrayList<Bedroom> bedrooms;

    @Before
    public void before(){
        bedrooms = new ArrayList<Bedroom>();
        conferenceRoom = new ConferenceRoom();
        bedroom1 = new Bedroom("1", 2, "Double");
        bedroom2 = new Bedroom("2", 4, "Family");
        bedroom3 = new Bedroom("3", 4, "Family");
        bedroom4 = new Bedroom("4", 1, "Single");
        bedroom5 = new Bedroom("5", 2, "King");
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);
        hotel = new Hotel(bedrooms, conferenceRoom);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(5, hotel.bedroomCount());
    }
}
