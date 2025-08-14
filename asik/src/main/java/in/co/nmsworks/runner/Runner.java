package in.co.nmsworks.runner;

import in.co.nmsworks.week1.day3.Candidate;

public class Runner
{
    static final float PI = 3.14f;

    public static void main(String[] args)
    {
        Runner.test1();
    }

    public static void test1()
    {
        Double d = Double.valueOf(1.1);
        double d1 = d;
        System.out.println(d);
        System.out.println(Runner.PI);
    }
}
