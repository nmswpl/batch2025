package in.co.nmsworks.week3.day1.test.set1;

public interface BatteryPowered
{
    int batteryUsagePerHr();
    int batteryAfterUsage(float hrs);
}
class Phone implements BatteryPowered{
    private int usagePerHr;

    public Phone(int usagePerHr) {
        this.usagePerHr = usagePerHr;
    }
    public int getUsagePerHr() {
        return usagePerHr;
    }

    @Override
    public int batteryUsagePerHr() {
        return usagePerHr;
    }

    @Override
    public int batteryAfterUsage(float hrs) {
        int updatedBattery = (int) (100 - (hrs * getUsagePerHr()));
        System.out.println("Phone Info");
        return updatedBattery;
    }
}

class Drone implements BatteryPowered{
    private int usagePerHr;

    public Drone(int usagePerHr) {
        this.usagePerHr = usagePerHr;
    }
    public int getUsagePerHr() {
        return usagePerHr;
    }

    @Override
    public int batteryUsagePerHr() {
        return usagePerHr;
    }

    @Override
    public int batteryAfterUsage(float hrs) {
        int updatedBattery = (int) (100 - (hrs * getUsagePerHr()));
        System.out.println("Drone Info");
        return updatedBattery;
    }
}


