package in.co.nmsworks.week2.day4;

public class InventoryReport extends SalesReport{
    @Override
    public void header() {
        System.out.println("it is inventory report header . ");
    }
    @Override
    public void body() {
        System.out.println("it is inventory report body . ");
    }

    @Override
    public void footer() {
        System.out.println("it is inventory report footer . ");
    }

}
