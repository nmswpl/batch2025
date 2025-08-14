package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{

    @Override
    String header() {
        return " Inside Sales Report Header ";
    }

    @Override
    String body() {
        return " Inside Sales Report body ";
    }

    @Override
    String footer() {
        return " Inside Sales Report footer ";
    }


}
