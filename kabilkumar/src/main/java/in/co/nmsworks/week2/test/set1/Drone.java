package in.co.nmsworks.week2.test.set1;

public class Drone implements BatteryPowered
{
    String name;
    int hrs;
    final  int battery = 10;

    public Drone(String name, int hrs) {
        this.name = name;
        this.hrs = hrs;
    }


    @Override
    public void batteryUasgePerHrs()
    {
        System.out.println("the drone device is :"+name);
        System.out.println("the drone usage is :" +hrs);
    }

    @Override
    public void BatteryAfterUse(float hrs)
    {
        System.out.println("the drone name is :" +name);
        float result = 0;
        if (battery - hrs > 1)
        {
             result =result + battery-hrs;

        }
      System.out.println(result);

    }
}
