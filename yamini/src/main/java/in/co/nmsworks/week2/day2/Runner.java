package in.co.nmsworks.week2.day2;

public class Runner {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee();
        f1.setDays(30);
        f1.setHours(8);
        System.out.println("Salary of a FullTime Employee: " + f1.calculateSalary(f1.hours, 10));
        PartTimeEmployee p1 = new PartTimeEmployee();
        p1.setDays(30);
        p1.setHours(4);
        System.out.println("Salary of a PartTime Employee: " + p1.calculateSalary(f1.hours, 5));
        Contractor c1 = new Contractor();
        c1.setHours(5);
        System.out.println("Salary of a Contractor: " + c1.calculateSalary(c1.hours, 3));

        Dog d = new Dog();
        System.out.println(d.makeSound());
        Bike b = new Bike();
        b.setModel("Honda");
        b.setYear(2023);
        b.setHbType(Bike.HandleBarType.LOWERED);
        System.out.println(b.display());

        Car c=new Car();
        c.setModel("Suzuki");
        c.setYear(2000);
        c.setNoOfDoors(5);
        System.out.println(c.display());




    }


}
