package in.co.nmsworks.week2.day4;


public class InventoryReport extends Report{

    @Override
    public void header() {
        System.out.println("inventory header");
    }

    @Override
    public void body() {
        System.out.println("inventory body");
    }

    @Override
    public void footer() {
        System.out.println("inventory footer");
    }

    @Override
    public void generate() {
        header();
        body();
        footer();

    }


}
