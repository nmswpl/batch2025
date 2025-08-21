package in.co.nmsworks.week2.test.odd;

import in.co.nmsworks.test.odd.BatteryPowered;
import in.co.nmsworks.test.odd.Drone;
import in.co.nmsworks.test.odd.Phone;

public class DeviceUsage {
    public void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs) {
        int remainingBattery = device.batteryAfterUse(noOfHrs);
        int usagePerHour = device.batteryUsagePerHour();

        System.out.println("Battery after "+noOfHrs +" hours"+remainingBattery);

        if (usagePerHour == 0) {
            System.out.println("This device does not consume battery.");
        }
        else {
            int remainingUsableHours = remainingBattery / usagePerHour;
            System.out.println("Remaining usable hours" +remainingUsableHours);
        }
    }



    public static void main(String[] args) {
        Phone phone = new Phone();
        Drone drone = new Drone();

        DeviceUsage usage = new DeviceUsage();

        System.out.println("Phone Usag");
        usage.printBatteryInfoAfterXHrsForDevice(phone, 3);

        System.out.println("Drone Usage");
        usage.printBatteryInfoAfterXHrsForDevice(drone, 2);

    }
}
