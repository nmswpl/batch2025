package in.co.nmsworks.week3.set2;

public class TestRunner {

    public static void main(String[] args) {
        Intern intern1 = new Intern("Maha",50000);
        Intern intern2 = new Intern("Nivedha",45000);
        Intern intern3 = new Intern("Ananthi",60000);
        Intern intern4 = new Intern("Lakshmi",50000);
        Intern intern5 = new Intern("Nandhini",50000);

        Intern[] interns = {intern1,intern2,intern3,intern4,intern5};
        System.out.println("The Average Salary of Interns are : " + averageSalary(interns));
        String str = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        int[] res = returnStringInfo(str);
        System.out.println("The number of statements in the paragraph: " + res[0]);
        System.out.println("The total number of words in the paragraph: " + res[1]);
        System.out.println("The total number of letters: " + res[2]);
    }


    public static int averageSalary(Intern[] interns) {
        int sum = 0;
        for (Intern intern : interns) {
            sum += intern.getSalary();
        }
        return sum/interns.length;
    }

    public static int[] returnStringInfo(String str) {
        int[] res = new int[3];
        String[] stat = str.split("\\.");
        res[0] = stat.length;
        String[] words = str.split(" ");
        res[1] = words.length;
        String letters = str.replace(" ","").replace(".","");
        res[2] = letters.length();
        return res;
    }
}
