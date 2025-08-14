package in.co.nmsworks.week2.day4;

public class SalesReport extends Report
{
    @Override
    public String header()
    {
        return "This is Sales Report Header";
    }

    @Override
    public String body()
    {
        return "This is Sales Report Body";
    }

    @Override
    public String footer()
    {
        return "This is Sales Report Footer";
    }

}
