package in.co.nmsworks.week2.day3;

public class BookingSystem implements MultiplexSystem {

    private int totalSeats = 50;
    private int availSeats = totalSeats;
    int initialTickets = 1;


    public BookingSystem(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailSeats() {
        return availSeats;
    }

    public void setAvailSeats(int availSeats) {
        this.availSeats = availSeats;
    }

    @Override
    public boolean checkAvailability(int count) {
        return getAvailSeats() >= count;
    }

    @Override
    public void bookTicket(int seats) {
        if(checkAvailability(seats)) {
            setAvailSeats(getAvailSeats() - seats);
            System.out.println("Ticket Booked: ");
            System.out.println("Ticket Id: ");
            for(int i = initialTickets ; i < initialTickets+seats ; i++) {
                System.out.print(" " + i);
            }
            System.out.println();
            System.out.println();
            initialTickets += seats;
        }
        else {
            System.out.println("Tickets not available");
        }
    }

    public static void main(String[] args) {
        BookingSystem screen1 = new BookingSystem(50);
        screen1.bookTicket(7);
        screen1.bookTicket(9);

        BookingSystem screen2 = new BookingSystem(60);
        screen2.bookTicket(5);

        BookingSystem screen3 = new BookingSystem(90);
        screen3.bookTicket(3);
    }
}
