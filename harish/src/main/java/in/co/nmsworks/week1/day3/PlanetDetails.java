package in.co.nmsworks.week1.day3;

public class PlanetDetails {
    String planet;
    int sizeDiameterInMiles;
    String color;
    int numberOfMoons;
    public PlanetDetails(){

    }
    public void setPlanet(String planet){
        this.planet = planet;
    }
    public String getPlanet(){
        return planet;
    }
    public void setSizeDiameterInMiles(int diameter){
        sizeDiameterInMiles = diameter;
    }
    public int getSizeDiameterInMiles(){
        return sizeDiameterInMiles;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setnumberOfMoons(int numberOfMoons){
        this.numberOfMoons=numberOfMoons;
    }
    public int getNumberOfMoons(){
        return numberOfMoons;
    }
}
