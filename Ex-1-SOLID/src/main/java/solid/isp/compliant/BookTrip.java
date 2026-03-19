package solid.isp.compliant;

public class BookTrip implements IFlight, IHotel, IRental{
 
    public void bookFlight() {
        // Code to book a flight    
            System.out.println("Booking flight...");
    }

    public void bookHotel() {
        // Code to book a hotel
        System.out.println("Booking hotel...");
    }

    public void bookCarRental() {
        // Code to book a car rental
        System.out.println("Booking car rental...");
    }
}
