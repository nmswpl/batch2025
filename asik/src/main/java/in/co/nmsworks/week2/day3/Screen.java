package in.co.nmsworks.week2.day3;

public class Screen implements Multiplex
{
    private int noOfAvailableSeats;
    private int ticketNumber = 1;

    public int getNoOfAvailableSeats() {
        return noOfAvailableSeats;
    }

    public void setNoOfAvailableSeats(int noOfAvailableSeats) {
        this.noOfAvailableSeats = noOfAvailableSeats;
    }

    public int getAvailability()
    {
        return getNoOfAvailableSeats();
    }

    @Override
    public boolean checkAvailability() {
        if ( getAvailability() > 0){
            return true;
        }
        return false;
    }

    @Override
    public void bookTicket(int noOfTickets)
    {
        System.out.println("Checking if Tickets are Available to Book Tickets : " + checkAvailability());;
        if ( noOfTickets <= 0 )
        {
            System.out.println("Invalid Ticket Requirement");
        }
        else if ( getAvailability() >= noOfTickets )
        {
            noOfAvailableSeats -= noOfTickets;
            for(int i = 0; i < noOfTickets; i++)
            {
                System.out.println("Ticket Number is " + ticketNumber++);
            }
        }
        else
        {
            System.out.println("Not Enough Seats Available");
        }
    }
    public static void main(String[] args)
    {
        Screen screen1 = new Screen();
        screen1.setNoOfAvailableSeats(10);
        System.out.println("Available Screen 1 : " + screen1.getAvailability());
        screen1.bookTicket(5);
        System.out.println("Checking if Tickets are Available : " + screen1.checkAvailability());
        screen1.bookTicket(5);
        System.out.println("Checking if Tickets are Available : " + screen1.checkAvailability());
        screen1.bookTicket(5);
        System.out.println("Available Screen 1 : " + screen1.getAvailability() + "\n");

        Screen screen2 = new Screen();
        screen2.setNoOfAvailableSeats(25);
        System.out.println("Available Screen 2 : " + screen2.getAvailability());
        screen2.bookTicket(15);
        System.out.println("Checking if Tickets are Available : " + screen2.checkAvailability());
        screen2.bookTicket(3);
        System.out.println("Checking if Tickets are Available : " + screen2.checkAvailability());
        screen2.bookTicket(5);
        System.out.println("Available Screen 2 : " + screen2.getAvailability() + "\n");

        Screen screen3 = new Screen();
        screen3.setNoOfAvailableSeats(15);
        System.out.println("Available Screen 3 : " + screen3.getAvailability());
        screen3.bookTicket(1);
        System.out.println("Checking if Tickets are Available : " + screen3.checkAvailability());
        screen3.bookTicket(2);
        System.out.println("Checking if Tickets are Available : " + screen3.checkAvailability());
        screen3.bookTicket(6);
        System.out.println("Available Screen 3 : " + screen3.getAvailability() + "\n");
    }
}
