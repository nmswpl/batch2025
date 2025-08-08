package in.co.nmsworks.week1.day3;

public class Planet
{
    private String name;
    private int diameterInMiles;
    private String color;
    private int noOfMoons;

    public Planet()
    {}

    public Planet(String name, int diameterInMiles, String color, int noOfMoons)
    {
        this.name = name;
        this.diameterInMiles = diameterInMiles;
        this.color = color;
        this.noOfMoons = noOfMoons;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setDiameterInMiles(int diameterInMiles)
    {
        this.diameterInMiles = diameterInMiles;
    }

    public int getDiameterInMiles()
    {
        return this.diameterInMiles;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setNoOfMoons(int noOfMoons)
    {
        this.noOfMoons = noOfMoons;
    }

    public int getNoOfMoons()
    {
        return this.noOfMoons;
    }
}
