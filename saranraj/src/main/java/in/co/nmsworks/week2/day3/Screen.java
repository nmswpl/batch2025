package in.co.nmsworks.week2.day3;

public class Screen implements Multiplex {
    private int ticketNumber = 4590;
    private String screenName;

    private int totalSeat;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Screen(int ticketCount) {
        this.totalSeat = ticketCount;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }




    @Override
    public void bookTicket(int count) {
        if (count > 0) {
            for (int i = 1; i<= count; i++ ){
                System.out.println("Ticket Number : " + "TICKET" +ticketNumber +getScreenName().toUpperCase()+i);
            }
            System.out.println("Ticket Booked!");
            totalSeat = totalSeat - count;
        }
        else {
            checkAvailability();
        }

    }

    @Override
    public void checkAvailability() {

        if (isAvailability(totalSeat)){
            System.out.println("Ticket Available on "+ getScreenName()+" : " + totalSeat);

        }
        else {
            System.out.println("Ticket is not Availability on "+ getScreenName());
        }

    }

    private boolean isAvailability(int ticketCount) {

        if (ticketCount > 0){
            return true;
        }
        return false;
    }

}
