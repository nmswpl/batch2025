package in.co.nmsworks.week2.day1.day4;

public class InventoryReport extends Report{

    private String name;
    private String id;
    private String department;

    public InventoryReport(String name, String id, String department) {
        System.out.println("Inventory Details");
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
