package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{
    @Override
    public String header() {
        return "Sales Report";
    }

    @Override
    public String body() {
        return "Hello! 100 Books Sold and 20% sales growth";
    }

    @Override
    public String footer() {
        return "Thank you!!";
    }

}
