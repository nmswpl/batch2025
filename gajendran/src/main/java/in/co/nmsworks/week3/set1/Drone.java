package in.co.nmsworks.week3.set1;

public class Drone implements BatteryPowered
{

    private int usageRatePerHour;
    private int batteryPer;

    public Drone(int usageRatePerHour) {
        this.usageRatePerHour = usageRatePerHour;
        this.batteryPer = 100;
    }

    public int batteryUsagePerHour() {
        return usageRatePerHour * (batteryPer/10);
    }
    @Override
    public int batteryAfterUse(float hours) {
        batteryPer -= hours * usageRatePerHour;
        return batteryPer;
    }
}
