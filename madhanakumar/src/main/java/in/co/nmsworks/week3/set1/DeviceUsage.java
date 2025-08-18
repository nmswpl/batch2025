package in.co.nmsworks.week3.set1;

public class DeviceUsage {


     static void printBatteryInfoAfterXHrsForDevice(BatteryPowered device, int hours) {

        int remainingBattery = device.batteryAfter(hours);
        int remainingHours = 0;

        if (device instanceof Phone) {
            Phone phone = (Phone) device;
            remainingHours = phone.remainingHours();
        } else if (device instanceof Drone) {
            Drone drone = (Drone) device;
            remainingHours = drone.remainingHours();
        }

        System.out.println("Remaining Battery: " + remainingBattery + "%, Remaining Usage Hours: " + remainingHours + " hours");
    }

    public static void main(String[] args) {

        BatteryPowered myPhone = new Phone(5);
        BatteryPowered myDrone = new Drone(10);


        printBatteryInfoAfterXHrsForDevice(myPhone, 3);
        printBatteryInfoAfterXHrsForDevice(myDrone, 2);
    }
}
