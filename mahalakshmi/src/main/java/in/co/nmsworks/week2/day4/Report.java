package in.co.nmsworks.week2.day4;

public abstract class Report {
    public abstract String header();
    public abstract String body();
    public abstract String footer();
    public String generate() {
        return header() + "\n" + body() + "\n"+ footer() + "\n";
    }
}
