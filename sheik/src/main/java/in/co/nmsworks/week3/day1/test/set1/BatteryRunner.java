package in.co.nmsworks.week3.day1.test.set1;

public class BatteryRunner
{
    public static void main(String[] args) {
        BatteryPowered phone = new Phone(5);
        BatteryPowered drone = new Drone(10);

        printBatteryInfoAfterXhrs(phone , 5);
        printBatteryInfoAfterXhrs(drone , 8);

}
public static void printBatteryInfoAfterXhrs(BatteryPowered device,int hrs){
        int remBattery = device.batteryAfterUsage(hrs);
        int remHrs = remBattery/ device.batteryUsagePerHr();
        System.out.println("remaining battery : " + remBattery + " remaining  hrs : " + remHrs);
    }
}
