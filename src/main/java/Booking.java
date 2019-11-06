public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public Bedroom hasBedroom(){
        return this.bedroom;
    }

    public void addBedroom(Bedroom bedroom){
        this.bedroom = bedroom;
    }

    public int getNightsBooked(){
        return this.nightsBooked;
    }

    public void updateNightsBooked(int nights){
        this.nightsBooked = nights;
    }

//    public void createBooking(Bedroom bedroom, int nights){
//        Booking booking =  new Booking(bedroom, nights);
//        return Booking booking;
//    }

}
