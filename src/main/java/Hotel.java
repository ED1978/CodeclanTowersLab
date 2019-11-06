import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ConferenceRoom conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<Bedroom> bedrooms, ConferenceRoom conferenceRooms, ArrayList<Booking> bookings ){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.bookings = bookings;
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

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.removeGuest(guest);
    }

    public int bookingCount(){
        return this.bookings.size();
    }

    public void addBooking(Bedroom bedroom, int nights){
        Booking booking = new Booking(bedroom, nights);
        this.bookings.add(booking);
    }

}
