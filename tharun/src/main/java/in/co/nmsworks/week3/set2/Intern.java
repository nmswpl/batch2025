package in.co.nmsworks.week3.set2;

public class Intern {

    private String name;
    private int salary;

    public Intern(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void objectCreattionForInterClassDetails(){
        Intern tharun = new Intern("Tharun",500);
        Intern kumar = new Intern("Kumar",1000);
        Intern thanatos = new Intern("Thanatos",600);

        Intern [] internArray = new Intern[] {tharun,kumar,thanatos};

        System.out.println("Average salary of Interns : "+printAverageSalary(internArray));
    }

    private static int printAverageSalary(Intern[] internArray) {
        int totalSalary = 0;
        for (Intern intern : internArray) {

            totalSalary  += intern.salary;

        }
        return totalSalary/internArray.length;
    }

    public static void main(String[] args) {
        objectCreattionForInterClassDetails();
    }
}
