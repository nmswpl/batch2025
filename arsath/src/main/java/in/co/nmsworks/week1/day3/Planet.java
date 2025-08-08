package in.co.nmsworks.week1.day3;

public class Planet {
    private String name;
    private int size;
    private String color;
    private int numberOfMoons;

    public Planet(){

    }

    public Planet(String name, int size, String color, int numberOfMoons){
        this.name = name;
        this.size = size;
        this.color = color;
        this.numberOfMoons = numberOfMoons;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setNumberOfMoons(int numberOfMoons){
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfMoons(){
        return numberOfMoons;
    }
}
