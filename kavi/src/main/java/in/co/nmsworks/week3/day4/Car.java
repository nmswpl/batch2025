package in.co.nmsworks.week3.day4;

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int yearOfMake;

    public Car(int id, String manufacturer, String model, int yearOfMake) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfMake = yearOfMake;
    }

    public int getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

}
