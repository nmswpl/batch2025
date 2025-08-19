package in.co.nmsworks.week3.test.set1;

public class Phone implements BatteryPowered {

    private int batteryPercentage =100;
    private float hours;

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }


    private int batteryUsagePerHour;

    public int getBatteryUsagePerHour() {
        return batteryUsagePerHour;
    }

    public void setBatteryUsagePerHour(int batteryUsagePerHour) {
        this.batteryUsagePerHour = batteryUsagePerHour;
    }



    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int usage= (int) (batteryUsagePerHour() * hours);
        batteryPercentage -=usage;
        if (batteryPercentage <0) return 0;

        return batteryPercentage;
    }
}
