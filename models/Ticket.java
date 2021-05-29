package models;
import tools.Helper;

public class Ticket {
    int id;
    public Passenger passenger;
    public Flight flight;

	public Passenger getPassenger() {
		return this.passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return this.flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}


    public Ticket(Passenger passenger, Flight flight) {
        this.id = Helper.getId();
        this.flight = flight;
        this.passenger = passenger;
    }

    public void displayDetails() {
        System.out.println("Flight details: ");
        // System.out.println("--------------------------------------------------------------------");
        flight.DisplayFlightDetailInTicket();
        // System.out.println("*********************************************************************");
        System.out.println("Passenger details: ");
        passenger.DisplayPassengerDetails();
        
    }
}
