package in.co.nmsworks.weeks.day4;

public class SalesReport extends Report {
    @Override
    public String header() {
        return "Sales Report";
    }

    @Override
    public String body() {
        return "Total Sales";
    }

    @Override
    public String footer() {
        return "Report generated";
    }



}
