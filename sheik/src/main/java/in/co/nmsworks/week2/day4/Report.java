package in.co.nmsworks.week2.day4;

public class Report
{
    public String header(){
        return "this is header mtd ";
    }
    public String body(){
        return "this is body mtd ";
    }
    public String footer(){
        return "this is footer mtd ";
    }

    public String generate(){
        return header()  + body() + footer();
    }

}
