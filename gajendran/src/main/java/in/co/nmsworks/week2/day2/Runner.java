package in.co.nmsworks.week2.day2;

public class Runner {

    public static void main(String[] args) {
        ContractEmployee gaja = new ContractEmployee();
        gaja.setNumberOfHourWorked(55);
        long a = gaja.generateSalary();
        System.out.println("Contractor");
        System.out.println(a);


        FullTimeEmployee fTE1 = new FullTimeEmployee();
        fTE1.setNumberOfDaysWorked(10);
        fTE1.setNumberOfHourWorked(5);
        System.out.println("FTE salay");
        System.out.println(fTE1.generateSalary());

        PartTimeEmployee pte1 = new PartTimeEmployee();
        pte1.setNumberOfDaysWorked(15);
        pte1.setNumberOfHourWorked(3);
        System.out.println("Part time employee");
        System.out.println(pte1.generateSalary());


        System.out.println("Animal Class Using Abstraction ");
        Dog d = new Dog();
        d.sound();


        Car tata = new Car();
        System.out.println();
        System.out.println("Car data");
        tata.setData(4,2025,"nano");
        tata.display();

        Bike hero = new Bike();
        System.out.println();
        System.out.println("Bike data");
        hero.setData(Bike.HandelBarType.LOWER,2015,"splendor");
        hero.display();
    }
}
