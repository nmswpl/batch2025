package in.co.nmsworks.week2.day1.day3;

public class Screen2 implements Multiplex{
    static int availableTickets = 30;
    static int ticketCounter = 1;

    public void bookTickets(int number) {
        if (availableTickets >= number) {
            System.out.println("Screen2: Booking " + number + " tickets...");
            for (int i = 0; i < number; i++) {
                System.out.println("Ticket Number: " + ticketCounter++);
            }
            availableTickets -= number;
            System.out.println("Screen2: Booking successful.");
        } else {
            System.out.println("Screen2: Not enough tickets available.");
        }
    }

    public void checkAvailability() {
        if (availableTickets == 0) {
            System.out.println("Screen2: Tickets not available");
        } else {
            System.out.println("Screen2: Available tickets = " + availableTickets);
        }
    }
}
