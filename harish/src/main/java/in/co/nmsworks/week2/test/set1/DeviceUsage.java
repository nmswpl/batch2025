package in.co.nmsworks.week2.test.set1;

public class DeviceUsage {

    public static void main(String[] args) {

        Phone p1 = new Phone("Oppo",5);
        Phone p2 = new Phone("Vivo",7);
        Drone d1 = new Drone("High-Fly",20);
        Drone d2 = new Drone("Low-Fly", 10);
        batteryPercentageInfoAfterXhoursOfUse(p1,5);
    }

    private static void batteryPercentageInfoAfterXhoursOfUse(BatteryPowered device, int noOfHours) {
        System.out.println("Batter percentage after the usage " + device.batterAfterUsage(noOfHours));
        System.out.println("The phone will work for " + device.numberOfHoursToUse() + " Hours");

    }
}
