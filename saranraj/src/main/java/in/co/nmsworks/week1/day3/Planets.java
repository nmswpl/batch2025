package in.co.nmsworks.week1.day3;

public class Planets {
    private String planetName;
    private long size;
    private String color;
    private int noOfMoon;


    public Planets(){

     }

     public Planets(String planetName, long size, String color, int noOfMoon){
        this.planetName = planetName;
        this.size = size;
        this.color = color;
        this.noOfMoon = noOfMoon;
     }

     public String getPlanetName()
     {
        return planetName;
     }
     public void setPlanetName(String planetName)
     {
        this.planetName = planetName;
     }
     public long getSize()
     {
        return size;
     }
     public void setSize(long size)
     {
        this.size = size;
     }
     public String getColor()
     {
        return color;
     }
     public void setColor(String color)
     {
        this.color = color;
     }
     public int getNoOfMoon()
     {
        return noOfMoon;
     }
     public void setNoOfMoon(int noOfMoon)
     {
        this.noOfMoon = noOfMoon;
     }



}
