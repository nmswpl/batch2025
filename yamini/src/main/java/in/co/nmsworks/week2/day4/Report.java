package in.co.nmsworks.week2.day4;

public abstract class Report {
    public abstract  void header();
    public abstract void body();
    public abstract void footer();
    public static void generate(Report report){
        report.header();
        report.body();
        report.footer();
    }

}

