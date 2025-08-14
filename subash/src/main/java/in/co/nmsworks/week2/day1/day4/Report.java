package in.co.nmsworks.week2.day1.day4;

public abstract class Report {

    public abstract void header();
    public abstract void body();
    public abstract void footer();

    public void generate()
    {
        this.header();
        this.body();
        this.footer();
    }


}
