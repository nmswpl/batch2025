package in.co.nmsworks.week2.test.set1;

public class DeviceUsageClass {

    public static void main(String[] args) {
        Phone samsung = new Phone();
        printBatteryInfoAfterXHrsForDevice(samsung, 6);

        Drone drone1 = new Drone();
        printBatteryInfoAfterXHrsForDevice(samsung, 10);
    }

    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs){
        System.out.println("After " + noOfHrs + " hours battery is " + device.batteryAfterUse(noOfHrs));
    }
}
