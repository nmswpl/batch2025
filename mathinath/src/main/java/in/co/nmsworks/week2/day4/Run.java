package in.co.nmsworks.week2.day4;

public class Run {
    public static void main(String[] args) {
        SalesReport s1=new SalesReport();
        s1.generate();
        InventoryReport i1=new InventoryReport();
        i1.generate();
    }
}
