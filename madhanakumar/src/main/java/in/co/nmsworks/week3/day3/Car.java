package in.co.nmsworks.week3.day3;

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int yearOfMake;

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public Car(int id, String manufacturer, String model, int yearOfMake) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfMake = yearOfMake;
    }
}
