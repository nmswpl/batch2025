package in.co.nmsworks.week1.day3;


public class PlanetClass {

    private String planet;
    private int size;
    private String color;
    private int numOfmoon;

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
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

    public int getNumOfmoon() {
        return numOfmoon;
    }

    public void setNumOfmoon(int numOfmoon) {
        this.numOfmoon = numOfmoon;
    }

    public void printTemp() {
        System.out.println("Planet : " + planet);
        System.out.println("Size (Diameter in miles): " + size);
        System.out.println("Color : " + color);
        System.out.println("Number of Moons : " + numOfmoon);
    }
}