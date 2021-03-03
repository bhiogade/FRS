package com.company;
import java.time.LocalDateTime;

public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] selectedTouristLocation;
    //const...
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancel, Flight flight, Passenger passenger,
                         String hotelAddress, String[] selectedTouristLocations) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancel, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }
    //method
    String getHotelAddress() {
        return hotelAddress;
    }

    void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}

