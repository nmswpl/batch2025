package in.co.nmsworks.week2.day4.report;

public abstract class Report {

    public abstract String head();

    public abstract String body();

    public abstract String footer();

    public void generate(){
        System.out.println(head()+"\t "+body()+"\t "+footer());
    }

}

/**
 * inheritace
 * abstract
 */