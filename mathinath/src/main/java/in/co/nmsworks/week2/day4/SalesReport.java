package in.co.nmsworks.week2.day4;

public class SalesReport extends Report {

    @Override
    public void header() {
        System.out.println("Sales header");
    }

    @Override
    public void body() {
        System.out.println("Sales body");
    }

    @Override
    public void footer() {
        System.out.println("Sales footer");
    }

    @Override
    public void generate() {
        header();
        body();
        footer();

    }

}
