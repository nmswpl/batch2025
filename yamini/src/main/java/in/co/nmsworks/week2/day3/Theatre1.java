package in.co.nmsworks.week2.day3;

public class Theatre1 implements MultiplexSystem {
    int total;
    int seatCounts;

    public Theatre1(int total){
        this.total=total;
    }

    @Override
    public void bookTicket() {
        if (!checkAvailability()) {
            System.out.println("Ticket not available");
        } else {
            for (int i = 1; i <=total; i++) {
                System.out.println(i+"Booked");

            }
        }
    }

    @Override
    public boolean checkAvailability() {
        if (seatCounts <= 0) {
            return false;
        } else {
            return true;
        }
    }
}
