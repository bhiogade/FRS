package com.company;

public class Flight {
    private String fightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight(){
        this("flightNumber", "airline",0, 0);
    }

    public Flight(String fightNumber, String airline, int capacity, int bookedSeats) {
        this.fightNumber = fightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    public Flight( Flight flight){
        this.fightNumber = flight.fightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;
    }
//setter and getter
    public String getFightNumber() {
        return fightNumber;
    }

    public void setFightNumber(String fightNumber) {
        this.fightNumber = fightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    //method
    public boolean checkAvailability(){

        if(this.bookedSeats < capacity)
            return true;
        else
            return false;
    }

    public void incrementBookingCounter(){

        this.bookedSeats++;
    }
}
