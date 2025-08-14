package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report
{
    @Override
    public String header() {
        return "This is Inventory Report Header";
    }

    @Override
    public String body() {
        return "This is Inventory Report Body";
    }

    @Override
    public String footer() {
        return "This is Inventory Report Footer";
    }

}
