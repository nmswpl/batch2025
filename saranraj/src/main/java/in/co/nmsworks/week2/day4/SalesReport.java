package in.co.nmsworks.week2.day4;

abstract class Report {
    abstract public void header();
    abstract public void body ();
    abstract public void footer();
    public void generate () {
        header();
        body();
        footer();
    }

}


public class SalesReport extends Report{

    @Override
    public void header() {
        System.out.println("This is SalesReport Header");
    }

    @Override
    public void body() {
        System.out.println("This is SalesReport Body");
    }

    @Override
    public void footer() {
        System.out.println("This is SalesReport Footer");
    }

    @Override
    public void generate() {
       header();
       body();
       footer();
    }


}
