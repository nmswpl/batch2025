package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report{
    @Override
    public String header() {
       return "Inventory Report";
    }

    @Override
    public String body() {
        return "100 books available";
    }

    @Override
    public String footer() {
       return "Stocks needed!!!";
    }


}
