package com.company;

public class RegularTicket  extends Ticket {
    private String special;

//const..
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancel, Flight flight,
                         Passenger passenger, String specialServices) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancel, flight, passenger);
        this.special = special;
    }
//method
    String getSpecialServices() {
        return special;
    }

    void setSpecialServices(String special) {
        this.special = special;
    }
}
