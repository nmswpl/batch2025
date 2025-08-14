package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{

    private String headerString = "Title: Annual Sales";
    public String bodyString = "This year profits 50% more than the previous year";
    public String footerString = "End of the report.";

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
