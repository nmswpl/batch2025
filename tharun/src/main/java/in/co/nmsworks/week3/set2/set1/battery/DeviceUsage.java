package in.co.nmsworks.week3.set2.set1.battery;

public class DeviceUsage {

    public static void main(String[] args) {
        BatteryPowered phone = new Phone(10);
        BatteryPowered drone = new Drone(15);
        int noOfHrs = 2;
        System.out.println("-----------For Phone -----------");
        printBatteryInfoAfterXHrsForDevice(phone ,noOfHrs);
        System.out.println("-----------For Drone -----------");
        printBatteryInfoAfterXHrsForDevice(drone,noOfHrs);
    }

    private static void printBatteryInfoAfterXHrsForDevice(BatteryPowered phone, int noOfHrs) {
        int remainingBattery = phone.batteryAfterUse(noOfHrs);
        System.out.println("Remaining Battery in Percentage : " + remainingBattery + " %");
        System.out.println("Remaining hours to use the device  : " + remainingBattery / phone.batteryUsagePerHour());

    }
}
