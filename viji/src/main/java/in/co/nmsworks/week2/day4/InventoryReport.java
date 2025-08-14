package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report{

    @Override
    String header(){
        return "Inside Inventory Report Header";
    }

    @Override
    String body() {
        return " Inside Inventory Report Body " ;
    }

    @Override
   String footer(){
        return "Inside Inventory Report Footer ";
    }



}
