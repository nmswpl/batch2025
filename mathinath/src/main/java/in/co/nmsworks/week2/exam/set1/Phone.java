package in.co.nmsworks.week2.exam.set1;

public class Phone implements BatteryPowered{

    int battery = 100;
    int hours = 5;
    @Override
    public int batteryUsagePerHour() {
        return battery/hours;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) (battery-hours);
    }
}
