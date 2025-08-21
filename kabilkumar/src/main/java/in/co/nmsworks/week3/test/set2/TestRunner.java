package in.co.nmsworks.week3.test.set2;

public class TestRunner {

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    private String name;
    private  int salary;

    public TestRunner(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        String givenSentense = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        wordsLetterSentense(givenSentense);


        TestRunner intern1 = new TestRunner("Kabil",2000);
        TestRunner intern2 = new TestRunner("Kumar",3000);
        TestRunner intern3 = new TestRunner("Kavi",200);
        TestRunner intern4 = new TestRunner("Krish",1000);

        TestRunner[] interns = {intern1,intern2,intern3,intern4};
        printAverageSalary(interns);
    }

    public static void wordsLetterSentense(String getGivenSentense) {

        String[] sentense1 = getGivenSentense.split("\\.");
        System.out.println("Total no of Statement : " + sentense1.length);
        String[] words = getGivenSentense.split(" ");
        System.out.println("Total no of words : " + words.length);
        int count = 0;
        for (int i = 0; i < getGivenSentense.length(); i++) {
            char ch = getGivenSentense.charAt(i);
            count++;
        }
        System.out.println("total no of  letters : " + count);
    }
    public  static  void    printAverageSalary(TestRunner[] intern)
    {
        int sum = 0;
        for (int i = 0; i <intern.length ; i++)
        {
            sum = sum + intern[i].getSalary();
        }

        int avg = sum / intern.length;
        System.out.println("The average salary of all Interns : "+avg);
    }
}
