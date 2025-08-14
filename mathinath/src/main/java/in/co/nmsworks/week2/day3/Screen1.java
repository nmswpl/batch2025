package in.co.nmsworks.week2.day3;

public class Screen1 implements Multiplex{
    int availableTicket;
    int ticket=1;

    public int getAvailableTicket() {
        return availableTicket;
    }

    public void setAvailableTicket(int availableTicket) {
        this.availableTicket = availableTicket;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean checkAvailability() {
        if(availableTicket >0)
            return true;
        return false;
    }

    @Override
    public void bookTicket(int noOfTicket) {
        if(checkAvailability())
        {
            if(availableTicket > noOfTicket)
            {
                availableTicket-=noOfTicket;
                System.out.println("ticket is booked");
            }
            else
            {
                System.out.println("request disabled");
            }
        }
        else
        {
            System.out.println("ticket not available");
        }

    }
}
