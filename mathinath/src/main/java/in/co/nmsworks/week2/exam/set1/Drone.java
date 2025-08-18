package in.co.nmsworks.week2.exam.set1;

public class Drone implements BatteryPowered{

    int battery = 90;
    int hours = 10;
    @Override
    public int batteryUsagePerHour() {
        return battery/hours;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) (battery-hours);
    }
}
