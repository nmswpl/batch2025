package in.co.nmsworks.week2.test.set1;

public class Drone implements BatteryPowered{

    private int batteryPercentage;
    @Override
    public int batteryUsagePerHour() {

        return 24 - batteryPercentage;
    }

    @Override
    public int batteryAfterUse(float hours) {

        int currentPercentage;
        currentPercentage = (100/24)*(int)hours;
        batteryPercentage = currentPercentage;
        return 100-currentPercentage;
    }
}
