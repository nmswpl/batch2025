package in.co.nmsworks.week1.day3;

public class Planet {

    private String planetName;
    private int size;
    private String color;
    private int numberOfMoons;

    public Planet (){
        System.out.println(" -- PLANET DETAILS -- ");
        System.out.println();
    }

    public Planet(String planetName, int size, String color, int numberOfMoons){
        this.planetName = planetName;
        this.size = size;
        this.color = color;
        this.numberOfMoons = numberOfMoons;
    }

    public String getPlanetName(){
        return planetName;
    }

    public int getSize(){
        return size;
    }

    public String getColor(){
        return color;
    }

    public int getNumberOfMoons(){
        return numberOfMoons;
    }
}
