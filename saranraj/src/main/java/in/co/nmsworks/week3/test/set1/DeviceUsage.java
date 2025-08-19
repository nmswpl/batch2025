package in.co.nmsworks.week3.test.set1;

import java.util.Collections;

public class DeviceUsage {
    public static void main(String[] args) {

       Phone phone = new Phone();
//       phone.setBatteryUsagePerHour(3);
//       phone.setBatteryUsagePerHour(4);
       Drone drone = new Drone();
//       drone.setBatteryUsagePerHour(6);
//       drone.setBatteryUsagePerHour(5);
       printBatteryInfoAfcterXHrsForDevice(phone,1);
       printBatteryInfoAfcterXHrsForDevice(drone,1);
    }

    private static void printBatteryInfoAfcterXHrsForDevice(BatteryPowered obj, int hours) {
        System.out.println("no of Hours Used : "+hours);
        System.out.println("Remaining battery : "+obj.batteryAfterUse(hours));
        int usage = obj.batteryUsagePerHour();
        int remainingHours=( usage > 0) ? obj.batteryAfterUse(hours) /usage :0;
        System.out.println("Remaining hours : "+remainingHours);

    }


}
