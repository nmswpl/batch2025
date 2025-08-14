package in.co.nmsworks.week2.day4;

public abstract class Report {

    abstract String header();
    abstract String body();
    abstract String footer();

    public void generate(){
        System.out.println(header() +"\n" + body() + "\n" + footer());
    }
}
