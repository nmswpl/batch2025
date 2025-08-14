package in.co.nmsworks.week2.day3;

public interface Multiplex {

    public int bookTicket(int book);
    public int ckeckAvailabilty(int avail);

}
class TheaterA implements Multiplex{

    int count;
     @Override
    public int bookTicket(int book) {
        if(book>0){
//           for(int i=0;i>book;i--){
//               count--;
//           }
            System.out.println("booking Ticket Successfully");

        }else {
            System.out.println("booking not successfully");
        }
        return book;
    }

    @Override
    public int ckeckAvailabilty(int avail) {
        if(avail<0){
            System.out.println("ticket available : ");
        }else {
            System.out.println("ticket unavailable : ");
        }


        return avail;
    }
}
class TheaterB implements Multiplex{

    @Override
    public int bookTicket(int book) {

        if(book>0){
            System.out.println("booking Ticket Successfull");

        }else {
            System.out.println("not available");
        }


        return book;
    }

    @Override
    public int ckeckAvailabilty(int avail) {
        return avail;
    }
}
class TheaterC implements Multiplex{

    @Override
    public int bookTicket(int book) {
        if(book>0){
            System.out.println("booking Ticket Successfull");

        }else {
            System.out.println("not available");
        }


        return book;
    }

    @Override
    public int ckeckAvailabilty(int avail) {

        return avail;
    }

    public static void main(String[] args) {
        TheaterA t1=new TheaterA();
        System.out.println("Ticket Availability : "+t1.ckeckAvailabilty(7));
        System.out.println("no of Ticket Booked : "+ t1.bookTicket(2));
        display(t1);
    }
    public static void display(Multiplex m){
        System.out.println();


    }
}