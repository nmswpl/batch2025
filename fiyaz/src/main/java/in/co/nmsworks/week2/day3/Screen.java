package in.co.nmsworks.week2.day3;

public class Screen implements Multiplex {

    private int seatCount ;
    private int seatNum = 1; ;

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
            System.out.println();
            System.out.println("Yes Available" + "\n" + "Available Ticket : " + seatCount);
            for (int i = 1; i <= ava; i++) {
                System.out.print(seatNum++ + " ");
            }
            seatCount = seatCount - ava;
            System.out.println();
            System.out.println("Available Seat : " + seatCount);
        }
        else{
            System.out.println();
            System.out.println("Ticket not Available " + "\n" + "Available Ticket : " + seatCount);
        }

        return seatNum;
    }
}
