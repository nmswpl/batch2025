package in.co.nmsworks.week2.day4;

public class GeneratedReports {
    public static void main(String[] args) {
        Report salesReports=new SalesReport();
        salesReports.body();

        Report invent=new InventoryReport();
        invent.body();

        Report generator=invent;
        invent.generate();


    }
}
