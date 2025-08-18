package in.co.nmsworks.week2.test.set1;

public class DeviceUsage
{
    public static void main(String[] args)
    {
        Phone redmi = new Phone(6, 10);
        printBatteryInfoAfterXHrsForDevice(redmi, (int) redmi.getHours());

        Drone droneX9 = new Drone(2, 15);
        printBatteryInfoAfterXHrsForDevice(droneX9, (int) droneX9.getHours());

    }

    public static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int noOfHrs)
    {
        System.out.println("The Battery After " + noOfHrs + "Hours Of Usage : " + device.batteryAfterUse(noOfHrs));
    }
}
