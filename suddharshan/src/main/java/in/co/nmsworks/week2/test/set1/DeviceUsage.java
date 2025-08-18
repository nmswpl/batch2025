package in.co.nmsworks.week2.test.set1;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setUsageRatePerHour(5);
        p1.setBattery(100);
        Drone d1 = new Drone();
        d1.setUsageRatePerHour(10);
        d1.setBattery(100);

        printBatteryInfoAfterXHrsForDevice(p1,2);
        printBatteryInfoAfterXHrsForDevice(d1,3);
    }
    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        int batteryRemaining = device.batteryAfterUse(noOfHrs);
        System.out.println("Remaining: " + batteryRemaining);
    }
}
