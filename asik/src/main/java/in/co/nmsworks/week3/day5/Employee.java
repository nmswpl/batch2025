package in.co.nmsworks.week3.day5;

import java.net.Inet4Address;
import java.util.List;

public class Employee
{
    private String name;
    private List<Integer> workingHoursList;
    private int totalWorkedHours;

    public Employee()
    {}

    public Employee(String name, List<Integer> workingHoursList)
    {
        this.name = name;
        this.workingHoursList = workingHoursList;
        calculateTotalWorkedHours();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Integer> getWorkingHoursList()
    {
        return workingHoursList;
    }

    public void setWorkingHoursList(List<Integer> workingHoursList)
    {
        this.workingHoursList = workingHoursList;
        calculateTotalWorkedHours();
    }

    public int getTotalWorkedHours()
    {
        return totalWorkedHours;
    }

    public void setTotalWorkedHours(int totalWorkedHours)
    {
        this.totalWorkedHours = totalWorkedHours;
    }

    private void calculateTotalWorkedHours()
    {
        int sumOfWorkedHours = 0;
        for (Integer hour : workingHoursList)
        {
            sumOfWorkedHours += hour;
        }
        this.totalWorkedHours = sumOfWorkedHours;
    }
}
