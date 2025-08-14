package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{

    @Override
    String header() {
        return "Sales Header";
    }

    @Override
    String body() {
        return "Sales Body";
    }

    @Override
    String footer() {
        return "Sales Footer";
    }

}
