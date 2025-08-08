package in.co.nmsworks.week1.day3;

public class Planet {

    private String planetName;
    private long size;
    private  String color;
    private  int numberOfMoons;



    public Planet(String planet, long size, String color, int numberOfMoons){
        this.planetName = planet;
        this.size = size;
        this.color = color;
        this.numberOfMoons = numberOfMoons;
    }


    public void setPlanetName(String planetName){
        this.planetName = planetName;
    }

    public void setSize(long size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setNumberOfMoons(int numberOfMoons){
        this.numberOfMoons = numberOfMoons;
    }





    public String getPlanetName(){
        return planetName;
    }

    public long getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }

    public int getNumberOfMoons(){
        return numberOfMoons;
    }


}
