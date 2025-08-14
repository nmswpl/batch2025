package in.co.nmsworks.week2.day1.day4;

public class SalesReport extends Report{

    private String name;
    private String id;
    private String department;

    public SalesReport(String name, String id, String department) {
        System.out.println("Sales Report");
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public void header() {
        System.out.println(name);
    }

    @Override
    public void body() {
        System.out.println(id);
    }

    @Override
    public void footer() {
        System.out.println(department);
    }
}
