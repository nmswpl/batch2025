package in.co.nmsworks.week1.day3.string.First;

public class PlantType {

    private String plant;
    private int size;
    private String color;
    private int noOfMoons;


    public PlantType(){

    }
    public PlantType(String plant,int size,String color,int noOfMoons){
        this.plant=plant;
        this.size=size;
        this.color=color;
        this.noOfMoons=noOfMoons;
    }

    public void setPlant(String plant){
        this.plant=plant;

    }
    public String getPlant(){
        return plant;

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
