package in.co.nmsworks.week3.test.set1;

public class Phone implements BatteryPowered {

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    private float hours;

    private int batteryUsagePerHour;

    public int getBatteryUsagePerHour() {
        return batteryUsagePerHour;
    }

    public void setBatteryUsagePerHour(int batteryUsagePerHour) {
        this.batteryUsagePerHour = batteryUsagePerHour;
    }


    @Override
    public int batteryUsagePerHour() {
        return batteryUsagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) (batteryUsagePerHour * hours);
    }
}
