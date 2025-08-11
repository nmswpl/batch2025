package in.co.nmsworks.week1.day3;

import java.util.Objects;

public class Planet {
    private String planet;
    private int size;
    private String color;
    private int numberOfMoons;

    public Planet(){

    }

    public Planet(String planet, int size,String color,int numberOfMoons){
        this.planet = planet;
        this.color = color;
        this.size = size;
        this.numberOfMoons = numberOfMoons;
    }

    public void setPlanet(String planet){
        this.planet = planet;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public String getPlanet(){
        return planet;
    }

    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

    public int getNumberOfMoons(){
        return numberOfMoons;
    }

    public void printPlanetInfo(Planet planet){
        System.out.println("Planet: "+ planet.getPlanet());
        System.out.println("Size: "+ planet.getSize());
        System.out.println("Color: " + planet.getColor());
        System.out.println("No. of Moons: " + planet.getNumberOfMoons());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return numberOfMoons == planet.numberOfMoons;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfMoons);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planet='" + planet + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}
