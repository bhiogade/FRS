package com.company;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.time.LocalDateTime;

public abstract class Ticket {
//attr...
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String seatNo;
    private String departureDateTime;
    private String arrivalDateTime;
    private float price;
    private boolean cancel;
    private Passenger passenger;

    ///cons
    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price,
                  boolean cancel, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.cancel = cancel;
        this.price = price;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancel;
    }

    public void setCancelled(boolean cancelled) {
        this.cancel = cancel;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    public void cancelTicket() {
        this.cancel = true;
    }

    //
    //public class TimeDiffTester {
        public java.lang.String show(long value, String showAs) {
            if (value == 0) {
                return "";
            } else {
                return Math.abs(value) + " " + showAs + " ";
            }
        }


        //
        public int getFlightDuration(){
            LocalDateTime departureTimeStamp = LocalDateTime.parse(this.departureDateTime);
            LocalDateTime arrivalTimeStamp = LocalDateTime.parse(this.arrivalDateTime);
            int days = arrivalTimeStamp.getDayOfMonth() - departureTimeStamp.getDayOfMonth();
            int totalHours = (days*24) + (arrivalTimeStamp.getHour() - departureTimeStamp.getHour());
            return totalHours;
        }

        @Override
        public String toString() {
            return "Ticket{" +
                    "pnr='" + pnr + '\'' +
                    ", from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", flight=" + flight +
                    ", passenger=" + passenger +
                    ", departureTimeStamp='" + departureDateTime + '\'' +
                    ", arrivalTimeStamp='" + arrivalDateTime + '\'' +
                    ", seatNo='" + seatNo + '\'' +
                    ", price=" + price +
                    ", cancel=" + cancel +
                    '}';

        }


}