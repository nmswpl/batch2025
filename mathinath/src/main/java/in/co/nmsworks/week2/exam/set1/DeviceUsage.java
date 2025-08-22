package in.co.nmsworks.week2.exam.set1;

public class DeviceUsage {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        new DeviceUsage().printBatteryInfoAfterXHrsForDevice(p1,5);
    }
    void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int
            noOfHrs) {

        System.out.println("battery percentage : ");
        System.out.println("Remaining hours: ");
    }
}
