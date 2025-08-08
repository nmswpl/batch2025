package in.co.nmsworks.week1.day3;

public class Planet {
    private String planet;
    private int size;
    private String color;
    private int numberofmoons;

    public Planet()
    {

    }
    //planet
    public void setPlanet(String planet)
    {
        this.planet=planet;
    }
    public String getPlanet()
    {
        return planet;
    }
    //size
    public void setSize(int size)
    {
        this.size=size;
    }
    public int getSize()
    {
        return size;
    }

    //color
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return color;
    }

    //Numberofmoons
    public void setNumberOfMoons(int numberofmoons)
    {
        this.numberofmoons=numberofmoons;
    }
    public int getNumnerOfMoons()
    {
        return numberofmoons;
    }

    public Planet(String planet,int size,String color,int numberofmoons)
    {
        this.planet=planet;
        this.size=size;
        this.color=color;
        this.numberofmoons=numberofmoons;
    }
}
