package in.co.nmsworks.week3.day3;

public class Car {
    private int id;
    private String manufacturer;
    private String model;
    private int yearOfModel;

    public Car(int id, String manufacturer, String model, int yearOfModel) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfModel = yearOfModel;
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

    public int getYearOfModel() {
        return yearOfModel;
    }

    public void setYearOfModel(int yearOfModel) {
        this.yearOfModel = yearOfModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfModel=" + yearOfModel +
                '}';
    }
}
