package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report {


    @Override
    public void header() {
        System.out.println("This is InventoryReport Header");
    }

    @Override
    public void body() {
        System.out.println("This is InventoryReport Body");
    }

    @Override
    public void footer() {
        System.out.println("This is InventoryReport Footer");
    }

    @Override
    public void generate() {
        header();
        body();
        footer();
    }

    public static void main(String[] args) {

          SalesReport sales = new SalesReport();
          sales.generate();
          System.out.println();
          InventoryReport inventoryReport = new InventoryReport();
          inventoryReport.generate();


    }
}
