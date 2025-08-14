package in.co.nmsworks.week2.day3;

public class VIPScreen implements Theatre{
    private static int noOfSeats = 10;
    private static String[] seats = {"V0", "V10", "V9", "V8", "V7", "V6", "V5", "V4", "V3", "V2", "V1"};

    public VIPScreen(){
        System.out.println("Welcome to VIP SCREEN");
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
