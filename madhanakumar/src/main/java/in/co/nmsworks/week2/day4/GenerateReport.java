package in.co.nmsworks.week2.day4;

public class GenerateReport{

    public static void main(String[] args) {
       SalesReport sr = new SalesReport("NMSWorks",325,"Thanking You");
       sr.generate();

       System.out.println("\n ================================= \n");

       InventoryReport ir = new InventoryReport("NMSWorks", 4000,"Thankig You",6500);
       ir.generate();
    }
}
