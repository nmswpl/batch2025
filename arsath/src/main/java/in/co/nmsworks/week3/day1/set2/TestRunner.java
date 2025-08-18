package in.co.nmsworks.week3.day1.set2;

public class TestRunner {
    public static void main(String[] args) {
        Intern intern1 = new Intern("Arsath",30000d);
        Intern intern2 = new Intern("Subash",32000d);
        Intern intern3 = new Intern("Madhan",30000d);
        Intern intern4 = new Intern("Mathi",40000d);

        Intern[] interns = new Intern[] {intern1,intern2,intern3,intern4};

        printSalary(interns);

    }

    public static void printSalary(Intern[] interns){
        for (int i = 0; i <= interns.length-1; i++) {
            System.out.println("Annual Salary of intern " + i + ": " + interns[i].calculateSalary());
        }
    }
}
