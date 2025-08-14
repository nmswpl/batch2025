package in.co.nmsworks.weeks.day4;

public class InventoryReport extends Report {
    @Override
    public String header() {
        return "Inventory Report";
    }

    @Override
    public String body() {
        return "Total Stock:";
    }

    @Override
    public String footer() {
        return "Report generated ";
    }


}
