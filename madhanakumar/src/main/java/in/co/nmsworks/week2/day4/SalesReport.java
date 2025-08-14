package in.co.nmsworks.week2.day4;

public class SalesReport extends Report{
    int noOfSales;
    String companyName;
    String endCredits;

    public SalesReport(String companyName, int noOfSales, String endCredits){

        this.companyName = companyName;
        this.noOfSales = noOfSales;
        this.endCredits = endCredits;
    }



    @Override
    public String header(){
        return "Company Name : "+companyName;
    }

    @Override
    public String footer(){
        return endCredits;
    }

    @Override
    public String body (){
        return "No.Of Sales : " + noOfSales;
    }

    public void generate(){
        System.out.println("Sales Report");
        System.out.println(header()+"\n"+body()+"\n"+footer());
    }
}
