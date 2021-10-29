package bus.reservation.client;

import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

public class Test {

	public static void main(String[] args) {
		
		TicketCounter ticketcount = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(ticketcount,"resindu",2);
		TicketBookingThread t2 = new TicketBookingThread(ticketcount,"resindu",2);

		t1.start();
		t2.start();
		

	}

}
