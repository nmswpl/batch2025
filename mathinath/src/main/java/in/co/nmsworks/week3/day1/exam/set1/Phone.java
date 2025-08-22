package in.co.nmsworks.week3.day1.exam.set1;

public class Phone implements BatteryPowered{
    public Phone(int batteryPercentage, int usageRate) {
        this.batteryPercentage = batteryPercentage;
        this.usageRate = usageRate;
    }

    int batteryPercentage;
    int usageRate;

    @Override
    public int batteryUsagePerHour() {
        return usageRate;
    }

    @Override
    public int batteryAfterUse(float hours) {
        batteryPercentage = batteryPercentage - (int) (usageRate * hours);
        return batteryPercentage;
    }
}
