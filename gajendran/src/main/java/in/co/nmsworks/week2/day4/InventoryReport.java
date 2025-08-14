package in.co.nmsworks.week2.day4;

public class InventoryReport implements Report{
    @Override
    public void header() {
        System.out.println("Printing Inventory Report");
    }

    @Override
    public void body() {
        System.out.println("Inventory Report Details");
    }

    @Override
    public void footer() {
        System.out.println("Inventory Report conclusion");
    }
}
