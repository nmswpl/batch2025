package in.co.nmsworks.week2.day3;

public class Screen1 implements MultiplexOperation{
    private int availableSeats = 100;
    private int ticketCounter = 100;


    @Override
    public void bookTicket(int seats) {
        if (seats <= 0) {
            System.out.println("No seats.");
        }
        if (availableSeats >= seats) {
            availableSeats =availableSeats- seats;
            System.out.println("Screen 1 Booked:");
            for (int i = 0; i < seats; i++) {
                System.out.println("Ticket Number:1"+(ticketCounter++));
            }
        } else {
            System.out.println(" seats not available in Screen 1");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Screen 1 Available Seats: " + availableSeats);
    }
}
