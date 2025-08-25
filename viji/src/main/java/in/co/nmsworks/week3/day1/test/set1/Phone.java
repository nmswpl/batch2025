package in.co.nmsworks.week3.day1.test.set1;

public class Phone implements BatteryPowered{
    private float hours;
    private int batteryUsagePerHour;

    Phone(){

    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }



    public int getBatteryUsagePerHour() {
        return batteryUsagePerHour;
    }

    public void setBatteryUsagePerHour(int batteryUsagePerHour) {
        this.batteryUsagePerHour = batteryUsagePerHour;
    }

    @Override
    public int batteryUsagePerHour() {
        return getBatteryUsagePerHour();
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) (100 - (hours * batteryUsagePerHour()));
    }
}
