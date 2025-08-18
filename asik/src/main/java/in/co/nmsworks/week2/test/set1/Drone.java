package in.co.nmsworks.week2.test.set1;

public class Drone implements BatteryPowered
{
    private float hours;
    private int batteryUsagePerHour;

    public Drone()
    {}

    public Drone(float hours, int batteryUsagePerHour)
    {
        this.hours = hours;
        this.batteryUsagePerHour = batteryUsagePerHour;
    }

    public float getHours()
    {
        return hours;
    }

    public void setHours(float hours)
    {
        this.hours = hours;
    }

    public int getBatteryUsagePerHour()
    {
        return batteryUsagePerHour;
    }

    public void setBatteryUsagePerHour(int batteryUsagePerHour)
    {
        this.batteryUsagePerHour = batteryUsagePerHour;
    }

    @Override
    public int batteryUsagePerHour()
    {
        return batteryUsagePerHour;
    }

    @Override
    public int batteryAfterUse(float hours)
    {
        return (int) (batteryUsagePerHour() * hours);
    }
}
