package in.co.nmsworks.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Contractor con = new Contractor();
        con.setHrs(9);
        System.out.println("Contractor salary: " + con.getSalary());
        FullTimeEmployee fte = new FullTimeEmployee();
        fte.setHrs(8);
        System.out.println("FTE salary: " + fte.getSalary());
        PartTimeEmployee pte = new PartTimeEmployee();
        pte.setHrs(5);
        System.out.println("PTE salary: " + pte.getSalary());
        Dog dog = new Dog();
        System.out.println(dog.makeSound());;
    }
}
