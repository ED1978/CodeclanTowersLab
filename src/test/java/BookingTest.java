import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom("1", 2, "Double");
        booking = new Booking(bedroom, 4);
    }

    @Test
    public void canAddBedroom() {
        booking.addBedroom(bedroom);
        assertEquals(bedroom, booking.hasBedroom());
    }

    @Test
    public void canUpdateNightsBooked() {
        booking.updateNightsBooked(4);
        assertEquals(4, booking.getNightsBooked());
    }

//    @Test
//    public void canCreateBooking() {
//        booking.createBooking(bedroom, 4);
//        assertEquals(bedroom, booking.hasBedroom());
//        assertEquals(4, booking.getNightsBooked());
//    }
}
