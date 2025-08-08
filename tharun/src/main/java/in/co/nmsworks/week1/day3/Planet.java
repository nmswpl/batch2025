package in.co.nmsworks.week1.day3;

public class Planet {

    private String planet;
    private String size;
    private String color;
    private int noOfMoon;

    public Planet(){
    }
    public Planet(String planet,String size,String color,int noOfMoon){
        this.planet=planet;
        this.size=size;
        this.color=color;
        this.noOfMoon=noOfMoon;
    }

    public void setPlanet(String planet){
        this.planet=planet;
    }
    public String getPlanet(){
        return planet;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setColor(String color){
        this.planet=planet;
    }
    public String getColor(){
        return color;
    }

    public void setNoOfMoon(int noOfMoon) {
        this.noOfMoon = noOfMoon;
    }

    public int getNoOfMoon() {
        return noOfMoon;
    }
}
