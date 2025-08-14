package in.co.nmsworks.week2.day3;

public class ScreenOne implements Multiplex{

    private int available;
    private int ticketNo = 0;
    public ScreenOne(int available) {
        this.available = available;
    }

    @Override
    public void bookTicket(int ticket) {
        if(ticket > available){
            System.out.println("Screen One Tickets are not available");
        }
        else{
            System.out.println("Screen One Tickets are booked..");
            for(int i = 1; i<ticket+1; i++){
                System.out.println("Ticket No. " + ++ticketNo);
            }
            available-=ticket;
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Available Tickets in Screen One: " + available);
    }
}
