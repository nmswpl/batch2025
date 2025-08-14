package in.co.nmsworks.week2.day1.day3;

public class Screen1 implements Multiplex{
     static int availableTickets = 50;
        static int ticketCounter = 1;

        public void bookTickets(int number) {
            if (availableTickets >= number) {
                System.out.println("Screen1: Booking " + number + " tickets...");
                for (int i = 0; i < number; i++) {
                    System.out.println("Ticket Number: " + ticketCounter++);
                }
                availableTickets -= number;
                System.out.println("Screen1: Booking successful.");
            } else {
                System.out.println("Screen1: Not enough tickets available.");
            }
        }

        public void checkAvailability() {
            if (availableTickets <= 0) {
                System.out.println("Screen1: Tickets not available");
            } else {
                System.out.println("Screen1: Available tickets = " + availableTickets);
            }
        }
    }
