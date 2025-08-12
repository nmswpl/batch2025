package in.co.nmsworks.week2.day2;

public class Vehical {
    private String model;
    private int year;

    public Vehical(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Vehical() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehical{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void displayDetails(Vehical vehical) {
        System.out.println("vehical");

    }



    public class Car extends Vehical {


        public Car(int noOfSheets) {
            super();
            this.noOfSheets = noOfSheets;
            this.noOfDoors = noOfDoors;
        }

        int noOfSheets;
        int noOfDoors;

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.setModel(model);
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.setYear(year);
        }


    }

    static class Bike extends Vehical {

        public Bike(String model, int year) {
            super(model, year);
        }

        public Bike() {

        }

        public enum HandleBartype {
            RISED(0),
            LOWER(1);

            HandleBartype(int num) {
            }

        }

    }

    public static void main(String[] args) {
        Vehical vehical = new Vehical("abcd",2025);
        Vehical v3=new Vehical("xyyz",2025);
        Vehical vehical1=new Bike("bike1...",2024);
        System.out.println(vehical1.toString()+v3.toString());
        System.out.println(vehical.toString());
        vehical.test();
        String name = "logeswari";
    }

    public void test() {
        Bike.HandleBartype v1 = Bike.HandleBartype.RISED;

        switch (v1) {
            case RISED: {
                System.out.println("bike1...");
                break;
            }
            case LOWER: {
                System.out.println("bike2....");
                break;
            }


        }
    }
}
