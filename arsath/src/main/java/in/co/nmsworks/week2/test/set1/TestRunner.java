package in.co.nmsworks.week2.test.set1;

import static in.co.nmsworks.week2.test.set1.TitleCase.changeToTitleCAse;

public class TestRunner {
    public static void main(String[] args) {
        String input = "java is my favourite programming language.";
        changeToTitleCAse(input);

        Intern intern1 = new Intern("Arsath","SWE");
        Intern intern2 = new Intern("Ahamed" , "SWE");
        Intern intern3 = new Intern("Vasanth","QA");
        Intern intern4 = new Intern("Vinoth","QA");
        Intern intern5 = new Intern("Madhan","SWE");

        Intern[] interns = new Intern[] {intern1,intern2,intern3,intern4,intern5};


        System.out.println(indices(interns));

        Phone samsung = new Phone(4);
        Drone aiven = new Drone(5);

        System.out.println("Percentage used per hour: " + samsung.batteryUsagePerHour() + "%");
        System.out.println("Remaining battery: " + samsung.batteryAfterUse(3.0f));

        System.out.println("Percentage used per hour: " + aiven.batteryUsagePerHour() + "%");
        System.out.println("Remaining battery: " + aiven.batteryAfterUse(3.0f));



    }

    public static int[] indices(Intern[] interns){
        for(int i=0; i<=interns.length-1; i++){
            System.out.println(i);
        }

        return new int[0];
    }

}
