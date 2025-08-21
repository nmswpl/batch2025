package in.co.nmsworks.week3.day1.day3;

public class Car {
    private int id;
    private String manafacture;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManafacture() {
        return manafacture;
    }

    public void setManafacture(String manafacture) {
        this.manafacture = manafacture;
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

    private int yearOfModel;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manafacture='" + manafacture + '\'' +
                ", model='" + model + '\'' +
                ", yearOfModel=" + yearOfModel +
                '}';
    }

    public Car(int id, String manafacture, String model, int yearOfModel) {
        this.id = id;
        this.manafacture = manafacture;
        this.model = model;
        this.yearOfModel = yearOfModel;
    }

    public Car(){

    }

}
