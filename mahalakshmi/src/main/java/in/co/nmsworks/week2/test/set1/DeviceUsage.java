package in.co.nmsworks.week2.test.set1;

public class DeviceUsage {
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs) {
        System.out.println(device.batteryUsagePerHour());
        System.out.println(device.batteryAfterUse(noOfHrs));
    }

    public static void main(String[] args) {
        BatteryPowered phone = new Phone(45);
        printBatteryInfoAfterXHrsForDevice(phone,2);
        BatteryPowered drone = new Drone(30);
        printBatteryInfoAfterXHrsForDevice(phone,2);

    }
}
