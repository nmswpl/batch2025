package in.co.nmsworks.week2.day4;

public class SalesReport implements Report{

    @Override
    public void header() {
        System.out.println("Printing Sales Report");
    }

    @Override
    public void body() {
        System.out.println("Sales Report Details");
    }

    @Override
    public void footer() {
        System.out.println("Sales Report conclusion");
    }
}
