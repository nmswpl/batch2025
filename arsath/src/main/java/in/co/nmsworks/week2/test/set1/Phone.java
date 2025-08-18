package in.co.nmsworks.week2.test.set1;

import static java.lang.Math.abs;

public class Phone implements BatteryPowered{

    private int noOfHoursUsed;

    public Phone() {
    }

    public Phone(int percentageUsed) {
        this.noOfHoursUsed = percentageUsed;
    }

    public int getPercentageUsed() {
        return noOfHoursUsed;
    }

    public void setPercentageUsed(int percentageUsed) {
        this.noOfHoursUsed = percentageUsed;
    }

    @Override
    public int batteryUsagePerHour() {
        int ratePerHour = 100/ this.noOfHoursUsed;
        return ratePerHour ;
    }

    @Override
    public int batteryAfterUse(float hours) {
        int rate = batteryUsagePerHour() * noOfHoursUsed;
        int batteryAfterUse = abs(100 - rate);
        return batteryAfterUse;
    }
}
