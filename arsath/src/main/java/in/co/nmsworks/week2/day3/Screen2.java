package in.co.nmsworks.week2.day3;

public class Screen2 implements MultiPlex {
    private int noOfTickets = 250;
    private int ticketId = 0;
    private int seatNo = 1;

    @Override
    public void bookTicket(int noOfTicketsWanted) {

        if (noOfTicketsWanted < noOfTickets) {
            noOfTickets -= noOfTicketsWanted;
            ticketId++;

            for (int i = 1; i <= noOfTicketsWanted; i++) {
                System.out.println("Ticket Id: " + ticketId + " Seat No: " + seatNo++ + " booked successfully");

            }

        } else {
            System.out.println("Tickets not available");
        }

    }

    @Override
    public boolean checkAvailability() {
        if (noOfTickets != 0) {
           return true;
        }
        return false;
    }
}