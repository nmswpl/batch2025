package in.co.nmsworks.week2.test.set1;

public class Phone implements BatteryPowered{
    public int battery;
    @Override
    public int batteryUsagePerHour() {
        return (24-battery/100);
    }

    @Override
    public int batteryAfterUse(float hours) {
        int batteryPercentage = (100/24)*(int)hours;
        battery = batteryPercentage;
        return 100-batteryPercentage;
    }
}
