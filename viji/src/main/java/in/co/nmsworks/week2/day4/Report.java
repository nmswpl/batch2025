package in.co.nmsworks.week2.day4;

public abstract class Report {

    abstract String header();
    abstract String body();
    abstract String footer();

    public String generate(){
        return header() + body() + footer() ;
    }

}
