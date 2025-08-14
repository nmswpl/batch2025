package in.co.nmsworks.week2.day4;

public class SalesReport extends Report {
    @Override
    public void header() {
        System.out.println("it is sales report header . ");
    }
    @Override
    public void body() {
        System.out.println("it is sales report body . ");

    }
    @Override
    public void footer() {
        System.out.println("it is sales report footer . ");

    }

}
