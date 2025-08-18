package in.co.nmsworks.week3.day1.da1;

public class Drone implements BatteryPowered{
    int totalPower=100;
    int usage=50;
    int hour=1;
    @Override
    public int batteryUsagePerHour() {
        if(totalPower%usage!=0){
            System.out.println(totalPower--);
        }
        return totalPower-hour;
    }

    @Override
    public int batteryAfterUse(float hours) {
        return 0;
    }
}
