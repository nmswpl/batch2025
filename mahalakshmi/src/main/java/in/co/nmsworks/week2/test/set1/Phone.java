package in.co.nmsworks.week2.test.set1;

public class Phone implements BatteryPowered {
    private double batteryUsed;
    int percentage;

    public Phone(double batteryUsed) {
        this.batteryUsed = batteryUsed;
    }

    public double getBatteryUsed() {
        return batteryUsed;
    }

    public void setBatteryUsed(double batteryUsed) {
        this.batteryUsed = batteryUsed;
    }

    @Override
    public int batteryUsagePerHour() {
        percentage = (int)(getBatteryUsed()/100) * 60;
        return percentage;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) ((percentage/100) * hours);
    }
}

class Drone implements BatteryPowered {

    private double batteryUsed;
    int percentage;

    public Drone(double batteryUsed) {
        this.batteryUsed = batteryUsed;
    }

    public double getBatteryUsed() {
        return batteryUsed;
    }

    public void setBatteryUsed(double batteryUsed) {
        this.batteryUsed = batteryUsed;
    }

    @Override
    public int batteryUsagePerHour() {
        percentage = (int)(getBatteryUsed()/100) * 60;
        return percentage;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return (int) ((percentage/100) * hours);
    }
}