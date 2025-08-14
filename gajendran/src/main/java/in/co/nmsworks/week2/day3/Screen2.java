package in.co.nmsworks.week2.day3;

public class Screen2 implements Theater{


    private static int numberOfSeatAvailable;
    private static int seatNumber = 1;

    public Screen2(int totalSeat) {

        numberOfSeatAvailable = totalSeat;

    }

    @Override
    public String bookTicket(int numberOfTicket) {
        if (numberOfSeatAvailable >= numberOfTicket){
            seatNumber += numberOfTicket;
            numberOfSeatAvailable -= numberOfTicket;
            String s = "Ticket Number " + (seatNumber - numberOfTicket) + " to " + (seatNumber - 1);
            return s;
        }
        return "Sorry Number Of Ticket Is Less Then " + numberOfTicket;


    }

    @Override
    public String checkAvailability() {
        return "Number Of Ticket Available is "+numberOfSeatAvailable;
    }

}
