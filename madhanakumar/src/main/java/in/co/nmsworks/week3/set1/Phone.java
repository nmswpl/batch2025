package in.co.nmsworks.week3.set1;

public class Phone implements BatteryPowered {
    private int batteryUsage;
    private int batteryPercentage = 100;


    public Phone(int batteryUsage) {
        this.batteryUsage = batteryUsage;
    }

    @Override
    public int batteryUsagePerHour() {
        return batteryUsage;
    }

    @Override
    public int batteryAfter(float hours) {
        int usage = Math.round(batteryUsage * hours);
        batteryPercentage -= usage;
        if (batteryPercentage < 0) batteryPercentage = 0;
        return batteryPercentage;
    }

    public int remainingHours() {
        return batteryPercentage / batteryUsage;
    }
}
