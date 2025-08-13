package in.co.nmsworks.week2.day3;

public class FirstFloorScreen implements Theatre{

    private static int noOfSeats = 10;
    private static String[] seats = {"F0", "F10", "F9", "F8", "F7", "F6", "F5", "F4", "F3", "F2", "F1"};

    public FirstFloorScreen(){
        System.out.println("Welcome to FIRST FLOOR SCREEN");
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
            for(int i = noOfSeats; i > noOfSeats-noOfTickets ; i --){
                System.out.print(seats[i] + " ");
            }
            System.out.println();
            noOfSeats-=noOfTickets;;
        }
        else{
            System.out.println("Check seat availability");
        }
    }
}
