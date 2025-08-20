package in.co.nmsworks.week3.set2.set1.battery;

public class Drone implements BatteryPowered{
    private int usagePerHour;
    private int batteryCapacity = 100;

    public Drone(int usagePerHour) {
        this.usagePerHour = usagePerHour;
    }

    @Override
    public int batteryUsagePerHour() {
        return this.usagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        this.batteryCapacity -= (batteryUsagePerHour()*hours);
        return this.batteryCapacity;
    }
}
