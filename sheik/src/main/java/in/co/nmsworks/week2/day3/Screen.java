package in.co.nmsworks.week2.day3;

public class Screen implements Multiplex
{
    private int totalSeats;
    private int ticketNumber;
    private int seatAvailability = totalSeats;

    public Screen() {
    }

    public Screen(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seatAvailability =totalSeats;
    }

    @Override
    public void bookTicket(int noOfTickets)
    {
        int seatAvailable = totalSeats;
        if(checkAvailability(noOfTickets))
        {
            for(int i=0;i<noOfTickets ;i++){
                ticketNumber++;
                System.out.println("Ticket No :" +ticketNumber);
            }
        }
        else{
            System.out.println("Ticket Not Available");
        }

    }

    @Override
    public boolean checkAvailability(int noOfTickets) {
        if(seatAvailability >0 && seatAvailability >= noOfTickets){
            return true;
        }
        else{
            return false;
        }
    }
}
