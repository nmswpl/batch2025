package in.co.nmsworks.week2.day3;

public class Screen1 implements Multiplex{
    int s1Ticket=10;

    @Override
    public void bookTicket(int ticket) {
        if(ticket < s1Ticket){
            System.out.println("Ticket is booked");
            s1Ticket--;
        }
        else
        {
            System.out.println("not booked");
        }
    }

    @Override
    public boolean  checkAvailability() {
       if(s1Ticket>0)
       {
           return true;
       }
       return false;
    }
}
