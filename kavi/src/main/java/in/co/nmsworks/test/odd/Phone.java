package in.co.nmsworks.test.odd;

public class Phone implements BatteryPowered{
    private int batteryPercentage = 100;
    private final int usagePerHour = 10;

    @Override
    public int batteryUsagePerHour() {

        return usagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int drain = Math.round(usagePerHour * hours);
        batteryPercentage -= drain;
        if (batteryPercentage < 0) batteryPercentage = 0;
        return batteryPercentage;
    }

    public int getBatteryPercentage() {

        return batteryPercentage;
    }

}
