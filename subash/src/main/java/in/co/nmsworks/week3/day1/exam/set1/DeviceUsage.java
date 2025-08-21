package in.co.nmsworks.week3.day1.exam.set1;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone phone = new Phone(100,10);
        printBatteryInfoAfterXHrsForDevice(phone,5);
        Drone drone = new Drone(100,20);
        printBatteryInfoAfterXHrsForDevice(drone,4);
    }
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int
            noOfHrs)
    {
        System.out.println("The battery usage per hour: "+device.batteryUsagePerHour());
        System.out.println("The battery after use: "+device.batteryAfterUse(noOfHrs));
    }
}
