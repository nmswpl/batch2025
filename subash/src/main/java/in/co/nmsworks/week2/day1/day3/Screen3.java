package in.co.nmsworks.week2.day1.day3;

public class Screen3 implements Multiplex{

    static int availableTickets = 40;
    static int ticketCounter = 1;

    public void bookTickets(int number) {
        if (availableTickets >= number) {
            System.out.println("Screen3: Booking " + number + " tickets...");
            for (int i = 0; i < number; i++) {
                System.out.println("Ticket Number: " + ticketCounter++);
            }
            availableTickets -= number;
            System.out.println("Screen3: Booking successful.");
        } else {
            System.out.println("Screen3: Not enough tickets available.");
        }
    }

    public void checkAvailability() {
        if (availableTickets == 0) {
            System.out.println("Screen3: Tickets not available");
        } else {
            System.out.println("Screen3: Available tickets = " + availableTickets);
        }
    }
}
