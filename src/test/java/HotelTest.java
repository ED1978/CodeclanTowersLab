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
    private ArrayList<Booking> bookings;
    private Booking booking1;

    @Before
    public void before(){
        bedrooms = new ArrayList<Bedroom>();

        conferenceRoom = new ConferenceRoom("Blue Room", 12);

        bedroom1 = new Bedroom("1", 2, "Double");
        bedroom2 = new Bedroom("2", 4, "Family");
        bedroom3 = new Bedroom("3", 4, "Family");
        bedroom4 = new Bedroom("4", 1, "Single");
        bedroom5 = new Bedroom("5", 2, "King");

        guest1 = new Guest("Sarah");
        guest2 = new Guest("Steven");
        guest3 = new Guest("Chris");
        guest4 = new Guest("Mark");
        guest5 = new Guest("David");

        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        bedrooms.add(bedroom4);
        bedrooms.add(bedroom5);

        bookings = new ArrayList<Booking>();
        booking1 = new Booking(bedroom1, 4);

        bookings.add(booking1);
        hotel = new Hotel(bedrooms, conferenceRoom, bookings);

    }

    @Test
    public void hasBedrooms() {
        assertEquals(5, hotel.bedroomCount());
    }

    @Test
    public void canCheckGuestIntoBedroom() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkInGuestToBedroom(guest2, bedroom1);
        hotel.checkOutGuestFromBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckGuestIntoConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom() {
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void hasBooking() {
        assertEquals(1, hotel.bookingCount());
    }

    @Test
    public void canAddBooking() {
        hotel.addBooking(bedroom1, 4);
        assertEquals(2, hotel.bookingCount());
    }
}
