package com.company;
//import java.sql.SQLOutput;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger = new Passenger("Meowss", "Mumbai","maharashtra",
                "john", "9876543210", "meow@gmail.com");
        Flight flight = new Flight("123ME","spicemeow", 250, 4);

        RegularTicket regularTicket = new RegularTicket("PNR1453", "Mum", "Nag",
                "02/03/21", "02/03/21", "14C",
                4500, false, flight, passenger, "massage");

        String hotelAddress = "Mariott Hotel, Mumbai";
        String[] locations = {"Nagpur","Nagpur"};

        TouristTicket touristTicket = new TouristTicket("PNR179", "Mum", "Nag",
                "02/03/21", "02/03/21", "15A",
                5400, false, flight, passenger, hotelAddress,locations);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){

        System.out.println(ticket.getPnr());

    }
}
