package bus.reservation.system;

public class TicketCounter {
	private int availableSeats = 3 ;
	
	public synchronized void bookTicket(String name,int numberOfSeats) {
		if((numberOfSeats>0) && (availableSeats>=numberOfSeats) ) {
			System.out.println("Hi "+name+ ':'+numberOfSeats+" seats booked successfully");	
			availableSeats = availableSeats-numberOfSeats;
		}else {
			System.out.println("seats are not available");			

		}
	}

}
