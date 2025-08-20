package in.co.nmsworks.week3.day3;

public class Car {

    private static int id;
    private String manufacturer;
    private String model;
    private int yearOfMake;

    public Car(String manufacturer, String model, int yearOfMake) {
        id++;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfMake = yearOfMake;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfMake=" + yearOfMake +
                '}';
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
