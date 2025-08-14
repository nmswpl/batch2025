package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report {

    private String headerString = "Title: Inventory Report";
    public String bodyString = "Everything perfectly works!!";
    public String footerString = "End of the report";

    @Override
    public String header() {
        return headerString;
    }

    @Override
    public String body() {
        return bodyString;
    }

    @Override
    public String footer() {
        return footerString;
    }
}
