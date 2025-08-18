package in.co.nmsworks.week3.day1;

public class CalculateAveSalOfIntern {
    public static void main(String[] args) {

        InternSet2 fiyaz = new InternSet2("Fiyaz", 35000);
        InternSet2 riyaz = new InternSet2("Riyaz", 30000);
        InternSet2 som = new InternSet2("Som", 25000);
        InternSet2 ram = new InternSet2("Ram", 20000);
        InternSet2 sam = new InternSet2("Sam", 15000);

        InternSet2[] internSet2s = new InternSet2[] {fiyaz, riyaz, som, ram, sam};

        finTheAverageSalary(internSet2s);

    }

    private static void finTheAverageSalary(InternSet2[] internSet2s) {

        int totalSal = 0;

        for (int i = 0; i< internSet2s.length; i++) {
            totalSal = totalSal + internSet2s[i].salary;
        }

        System.out.println("The Average Salary is :: " + totalSal/ internSet2s.length);
    }

}
