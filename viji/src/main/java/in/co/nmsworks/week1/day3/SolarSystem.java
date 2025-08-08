package in.co.nmsworks.week1.day3;

public class SolarSystem {

    private String planet;
    private int size;
    private String color;
    private int noOfMoons;

    public void setPlanet(String planet){
        this.planet=planet;
    }
    public String getPlanet(){
        return planet;
    }

    public void setSize(int size){
        this.size=size;
    }
    public int getSize(){
        return size;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    public void setNoOfMoons(int noOfMoons){
        this.noOfMoons=noOfMoons;
    }
    public int getNoOfMoons(){
        return noOfMoons;
    }

    public SolarSystem(){

    }

    public SolarSystem(String planet,int size,String color,int noOfMoons){
        this.planet=planet;
        this.size=size;
        this.color=color;
        this.noOfMoons=noOfMoons;
    }


}
