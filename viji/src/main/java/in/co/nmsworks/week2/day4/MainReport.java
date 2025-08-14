package in.co.nmsworks.week2.day4;

public class MainReport {
    public static void main(String[] args) {

        Report sr = new SalesReport();
        System.out.println( sr.generate());

        System.out.println();

        Report sr1 = new InventoryReport();
        System.out.println(sr1.generate());

    }
}
