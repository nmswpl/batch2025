package in.co.nmsworks.week2.test.set1;

public class Phone implements  BatteryPowered
{


    String name;

    public Phone(String name, int hrs) {
        this.name = name;
        this.hrs = hrs;
    }

    int hrs;






    @Override
    public void batteryUasgePerHrs()
    {
        System.out.println("the phone device : "+name);
        System.out.println("the phone usage per hrs "+ hrs);

    }

    @Override
    public void BatteryAfterUse(float hrs)
    {
        System.out.println("the phone device " + name);
        System.out.println("the phone usage : " + hrs);
    }
}
