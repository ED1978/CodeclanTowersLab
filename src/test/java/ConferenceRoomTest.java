import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private ArrayList<Guest> guests;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void before(){
        guests = new ArrayList<Guest>();
        guest1 = new Guest("Sarah");
        guest2 = new Guest("Steven");
        guest3 = new Guest("Chris");
        guest4 = new Guest("Mark");
        guest5 = new Guest("David");
        conferenceRoom = new ConferenceRoom("Blue Room", 2);
    }

    @Test
    public void canAddGuest() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void checkHasCapacity() {
        assertEquals(true, conferenceRoom.hasCapacity());
    }

    @Test
    public void canAddGuestIfEnoughCapacity() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void cannotAddGuestIfFull() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.addGuest(guest3);
        assertEquals(2, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest1);
        assertEquals(1, conferenceRoom.guestCount());
    }
}
