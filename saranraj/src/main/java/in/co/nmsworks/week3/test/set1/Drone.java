package in.co.nmsworks.week3.test.set1;

import java.util.Collections;

public class Drone implements BatteryPowered {
    private float hours;
    private int batteryPercentage =100;

    private int batteryUsagePerHour;

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
