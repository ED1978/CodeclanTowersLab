import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
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
        bedroom = new Bedroom("1", 2, "Double");
    }

    @Test
    public void canAddGuest() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void checkHasEnoughCapacity() {
        assertEquals(true, bedroom.hasEnoughCapacity());
    }

    @Test
    public void canAddGuestIfEnoughCapacity() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void cannotAddGuestIfFull() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.guestCount());
    }
}
