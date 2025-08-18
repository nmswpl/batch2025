package in.co.nmsworks.week3.test.set1;

public class DeviceUsage {
    public static void main(String[] args) {

       Phone phone = new Phone();
       phone.setBatteryUsagePerHour(3);
       phone.setBatteryUsagePerHour(4);
       Drone drone = new Drone();
       drone.setBatteryUsagePerHour(6);
       drone.setBatteryUsagePerHour(5);
       printBatteryInfoAfcterXHrsForDevice(phone,4);
       printBatteryInfoAfcterXHrsForDevice(drone,5);
    }

    private static void printBatteryInfoAfcterXHrsForDevice(BatteryPowered obj, int hours) {
        System.out.println("remaining hours : "+obj.batteryAfterUse(hours));

    }


}
