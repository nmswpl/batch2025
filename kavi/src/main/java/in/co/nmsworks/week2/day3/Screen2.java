package in.co.nmsworks.week2.day3;

public class Screen2 implements MultiplexOperation{
    private int availableSeats = 80;
    private int ticketCounter = 100;

    @Override
    public void bookTicket(int seats) {
        if (seats <= 0) {
            System.out.println("Invalid number of seats.");

        }

        if (availableSeats >= seats) {
            availableSeats -= seats;
            System.out.println("Screen 2Ticket Booked:");
            for (int i = 0; i < seats; i++) {
                System.out.println("Ticket Number:2" + (ticketCounter++));
            }
        } else {
            System.out.println("seats is not available in Screen 2.");
        }


    }

    @Override
    public void checkAvailability() {
        System.out.println(" seats not  available in Screen 2");

    }
}
