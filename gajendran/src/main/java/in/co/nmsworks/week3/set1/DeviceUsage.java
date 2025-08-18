package in.co.nmsworks.week3.set1;

public class DeviceUsage {

    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int
            noOfHrs){
        device.batteryAfterUse(noOfHrs);
        System.out.println("battery percentage "+device.batteryAfterUse(noOfHrs));
        System.out.println("remaining hours the device can be used after the "  +
                noOfHrs+" hours of use is "+device.batteryUsagePerHour());

    }

    public static void main(String[] args) {
        BatteryPowered phone = new Phone(10);
        printBatteryInfoAfterXHrsForDevice(phone, 2);
    }

}
