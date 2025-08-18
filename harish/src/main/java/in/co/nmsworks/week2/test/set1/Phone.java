package in.co.nmsworks.week2.test.set1;

public class Phone implements BatteryPowered {
    private String name;
    private int batteryUsage;
    private int batteryPercentage = 100;

    Phone(String name, int batteryUsage){
        this.batteryUsage = batteryUsage;
        this.name = name;
    }
    @Override
    public float numberOfHoursToUse(){
        return (float) batteryPercentage / batteryUsage;
    }

    @Override
    public int batterAfterUsage(float hours) {
        batteryPercentage = batteryPercentage - (int)hours * batteryUsage;
        return batteryPercentage;
    }

    @Override
    public int batteryUsagePerHour() {
        return batteryUsage;
    }

}
