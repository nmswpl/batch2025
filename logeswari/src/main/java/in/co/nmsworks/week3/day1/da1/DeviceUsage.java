package in.co.nmsworks.week3.day1.da1;

public class DeviceUsage {
    public static void main(String[] args) {
        BatteryPowered obj1=new Phone();
        printBatteryInfoAfterXHrsForDevice(obj1,2);


    }
   public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int
            noOfHrs){
       System.out.println("battery power info");
   }
}
