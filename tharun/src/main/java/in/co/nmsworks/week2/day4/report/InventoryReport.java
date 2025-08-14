package in.co.nmsworks.week2.day4.report;

public class InventoryReport extends Report{

    @Override
    public String head() {
        return "Inventory Report Head";
    }

    @Override
    public String body() {
        return "Inventory Report Body";
    }

    @Override
    public String footer() {
        return "Inventory Report Footer";
    }



}
