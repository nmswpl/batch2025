package in.co.nmsworks.week2.day3.multiplex;

public class Screen1 implements Multiplex{
    int totalSeats=10;
    int seatNumber=0;

    @Override
    public boolean checkAvailability(int noOfSeats) {
        if (totalSeats > 0){
            if (totalSeats < noOfSeats){
                System.out.println(noOfSeats+ " Seats are unavailable");
            }
            else{
                System.out.println(noOfSeats+" Seats are Available");
            }
            return true;
        }
        else{
            System.out.println("Seats Unavailable");
            return false;
        }
    }

    @Override
    public void bookTicket(int noOfSeats) {
        if (totalSeats > 0 && totalSeats >= noOfSeats){
            this.totalSeats = this.totalSeats - noOfSeats;
            System.out.println("Ticket Booked");
            for(int i=1;i<=noOfSeats;i++){
                seatNumber += 1;
                System.out.println("Your Booked Seat Number : "+seatNumber);
            }
        } else if (totalSeats == 0) {
            System.out.println("House Full");

        } else{
            System.out.println("We have only "+ totalSeats+" Available");
        }
    }
}
