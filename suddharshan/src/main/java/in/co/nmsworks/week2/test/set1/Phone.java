package in.co.nmsworks.week2.test.set1;

public class Phone implements BatteryPowered {
    private int battery;
    private int usageRatePerHour;

    public int getBattery() {
        return battery;
    }

    public int getUsageRatePerHour() {
        return usageRatePerHour;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setUsageRatePerHour(int usageRatePerHour) {
        this.usageRatePerHour = usageRatePerHour;
    }

    @Override
    public int batteryUsagePerHour() {
        return usageRatePerHour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        battery = (int) (battery - (hours * usageRatePerHour));
        return battery;
    }

}
