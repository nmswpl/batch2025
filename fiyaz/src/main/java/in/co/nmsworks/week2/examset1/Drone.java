package in.co.nmsworks.week2.examset1;

public class Drone implements BatteryPowered{
    @Override
    public int batteryUsagePerHour() {
        return 0;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return 0;
    }
}
