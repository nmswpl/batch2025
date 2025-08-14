package in.co.nmsworks.week2.day3;

public class Screen3 implements Multiplex{

    int ticketNumber;
    int availableTicket = 110;

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String bookTicket() {
        if (checkAvailability() == true ) {
            return "Screen1 Booked => TicketNumber : " + printTicketNumber() + ", Remaining tickets " + updateAvailablity(ticketNumber);
        }
        return "Sorry Requested Tickets Not Available ";
    }

    @Override
    public Boolean checkAvailability() {
        if(availableTicket > 0 && ticketNumber <= availableTicket)
            return true;
        return false;
    }

    public int printTicketNumber(){
        return getTicketNumber();
    }

    public int updateAvailablity(int ticketNumber){
        availableTicket = availableTicket - ticketNumber;
        return availableTicket;
    }
}
