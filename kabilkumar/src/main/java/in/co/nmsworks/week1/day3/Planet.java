package in.co.nmsworks.week1.day3;
/*

Planet	Size (Diameter in miles)	Color	Number of Moons
Mercury	3,032	Grayish and rocky	0
Venus	7,520	Yellowish-white	0
Earth	7,917	Blue and green	1
Mars	4,212	Red	2
Jupiter	86,881	Brown with white clouds	79
Saturn	72,366	Yellowish with rings	82
Uranus	31,518	Light blue/green	27
Neptune	30,598	Dark blue	14
Pluto	1,473	Brown and white with some red	5
**/
public class Planet {
    private String planet;
    private int size;
    private String color;
    private int noOfMoons;


    public Planet()
    {
    }
    public Planet(String planet,int size,String color,int noOfMoons)
    {
        this.planet=planet;
        this.size=size;
        this.color=color;
        this.noOfMoons=noOfMoons;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNoOfMoons(int noOfMoons) {
        this.noOfMoons = noOfMoons;
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }
}

