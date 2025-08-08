package in.co.nmsworks.week1.day3;
public class Planets {

    private String planetName;
    private int size;
    private String color;
    private int noOfMoons;

    public Planets(){
    }

    public Planets(String planetName,int size,String color,int noOfMoons) {
        this.planetName = planetName;
        this.size = size;
        this.color = color;
        this.noOfMoons = noOfMoons;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int num) {
        noOfMoons = num;
    }

}
