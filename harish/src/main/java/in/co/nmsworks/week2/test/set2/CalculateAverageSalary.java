package in.co.nmsworks.week2.test.set2;

public class CalculateAverageSalary{
    public static void main(String[] args) {
        Intern intern1 = new Intern("harish",20000);
        Intern intern2 = new Intern("kabil", 20033);
        Intern intern3 = new Intern("sheik",25555);
        Intern intern4 = new Intern("anu",234444);
        Intern[] internArray = {intern1,intern2,intern3,intern4};
        calculateAverageSalary(internArray);
    }
    public static void calculateAverageSalary(Intern[] intern){
        int totalSalary = 0 ;
        System.out.println(intern[0].getSalary());
        for (int i = 0 ; i < intern.length -1 ; i ++){
             totalSalary = totalSalary + intern[0].getSalary();

        }
        System.out.println("Average salary : " + totalSalary / intern.length);
    }
}
