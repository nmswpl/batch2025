package in.co.nmsworks.week2.day3;

public class Screen1 implements Theatre {

    private static int availablity = 100;
    private  static int ticketNumber = 0;


    @Override
    public String printTheAvailability() {

        if(availablity > 0){
            return  "Ticket Available :" + availablity;
        }
        else {
            return "Ticket unavailable";
        }
    }

    @Override
    public void bookTicket(int numberOfTickets) {

         if (availablity > numberOfTickets){

             availablity = availablity - numberOfTickets;
             for(int i = 0;i < numberOfTickets ; i++){

                 ticketNumber ++;
                 System.out.println("The Ticket is booked and Ticket number is " + ticketNumber);
             }

         }
         else {
             System.out.println("The Ticket is unavailable");
         }
    }
}
