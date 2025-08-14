package in.co.nmsworks.week2.day3;

public class SecondFloorScreen implements Theatre{

    private static int noOfSeats = 10;
    private static String[] seats = {"S0", "S10", "S9", "S8", "S7", "S6", "S5", "S4", "S3", "S2", "S1"};

    public SecondFloorScreen(){
        System.out.println("Welcome to SECOND FLOOR SCREEN");
    }

    @Override
    public boolean checkAvailability(int noOfTickets) {
        if(noOfTickets > 0 && noOfTickets <= noOfSeats){
            return true;
        }
        if(noOfTickets == 0){
            System.out.println("No seats Available");
            return false;
        }
        if(noOfTickets > noOfSeats){
            System.out.println("Only " + (noOfSeats) + " are available");
            return false;
        }
        return false;
    }

    @Override
    public void bookTickets(int noOfTickets) {
        if(this.checkAvailability(noOfTickets)){
            System.out.println("Your seats are booked : ");
            for(int i = noOfSeats; i > noOfSeats-noOfTickets; i --){
                System.out.print(seats[i] + " ");
            }
            System.out.println();
            noOfSeats-=noOfTickets;
        }
        else{
            System.out.println("Check seat availability");
        }
    }
}
