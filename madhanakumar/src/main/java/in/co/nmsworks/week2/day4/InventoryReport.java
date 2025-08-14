package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report{
    int noOfSales;
    String companyName;
    String endCredits;
    int stockLevel;

    public InventoryReport(String companyName, int noOfSales, String endCredits, int stockLevel) {
        this.companyName = companyName;
        this.noOfSales = noOfSales;
        this.endCredits = endCredits;
        this.stockLevel = stockLevel;
    }



    public String header(){
        return "Company Name : "+companyName;
    }

    public String footer(){
        return endCredits;
    }

    public String body (){
        return "No.Of Sales : " + noOfSales +'\n'+ "Stock Level : " + stockLevel;
    }

    public void generate(){
        System.out.println("Inventory Report");
        System.out.println(header()+"\n"+body()+"\n"+footer());
    }
}
