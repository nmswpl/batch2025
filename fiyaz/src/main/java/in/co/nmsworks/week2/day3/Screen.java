package in.co.nmsworks.week2.day3;

public class Screen implements Multiplex {

    private int seatCount ;

    public Screen(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public int bookTicket(int num) {
        return 0;
    }

    @Override
    public int checkAvailability(int ava) {
        if (ava < seatCount) {
            System.out.println("Yes Available" + "\n" + "Available Ticket : " + seatCount);
        }
        else{
            System.out.println("Ticket not Available " + "\n" + "Available Ticket : " + seatCount);
        }

        return ava;
    }
}
