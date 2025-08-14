package in.co.nmsworks.week2.day4;

public abstract class Report {
    public abstract String header();
    public abstract String body();
    public abstract String footer();
    public String generate(){
        return header() + "\n" + body() + "\n" + footer();
    }

    public static void main(String[] args) {
        SalesReport s = new SalesReport();
        System.out.println(s.generate());
        InventoryReport i = new InventoryReport();
        System.out.println(i.generate());
    }
}
class SalesReport extends Report{
    @Override
    public String header() {
        return "Sales Report: ";
    }

    @Override
    public String body() {
        return "This is the content of Sales Report";
    }

    @Override
    public String footer() {
        return "End of Sales Report";
    }
}

class InventoryReport extends Report{
    @Override
    public String header() {
        return "Inventory Report: ";
    }

    @Override
    public String body() {
        return "This is the content of Inventory Report";
    }

    @Override
    public String footer() {
        return "End of Inventory Report";
    }
}
