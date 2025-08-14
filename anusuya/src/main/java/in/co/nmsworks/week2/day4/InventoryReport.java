package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report{

    @Override
    String header() {
        return "Inventory header";
    }

    @Override
    String body() {
        return "Inventory Body";
    }

    @Override
    String footer() {
        return "Inventory Footer";
    }
}
