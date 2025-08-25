package in.co.nmsworks.week3.day1.test.set1;

import java.util.ArrayList;
import java.util.List;

public class DeviceUsage {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.setHours(6);
        printBatteryInfoAfterXHrsForDevice(phone, 6);

        Drone drone = new Drone();
        drone.setHours(3);
        printBatteryInfoAfterXHrsForDevice(drone , 3);
    }
    public  static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device , int noOfHrs){
        System.out.println("The battery usage hour is : " + device.batteryUsagePerHour() +" The battery remaining after usage is : "+device.batteryAfterUse(noOfHrs));
    }
}
