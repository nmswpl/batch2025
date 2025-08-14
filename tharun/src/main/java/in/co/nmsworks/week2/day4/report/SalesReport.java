package in.co.nmsworks.week2.day4.report;

public class SalesReport extends Report{


    @Override
    public String head() {
        return "Sales Report Head";
    }

    @Override
    public String body() {
        return "Sales Report Body";
    }

    @Override
    public String footer() {
        return "Sales Report Footer";
    }



}
