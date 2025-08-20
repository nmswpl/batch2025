package in.co.nmsworks.weel3.day3;

public class Car {
    private int id = 1;
    private String manufacturer;
    private String model;
    private int yearOfMake;

    public int getId() {
        return id;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }



    Car(int id , String manufacturer, String model, int yearOfMake){
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfMake = yearOfMake;
    }
}
