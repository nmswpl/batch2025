package in.co.nmsworks.week2.test.set2;


/*

Input 1:
The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.
Input 2:
Alice went to the market to buy fresh apples. Bob followed her. They chatted along the way.

 */


public class TestRunner {





    public static void main(String[] args) {

        String sentence ="The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";

        printAndCalculateAverageSalaryOfIntern();
       int[] Calculate = CalculateAndDisplayTheValueInArray(sentence);

       for (int i : Calculate) {
           System.out.println(i);
       }


    }

    private static int[] CalculateAndDisplayTheValueInArray(String sentence) {
        String[] noOfStatments = sentence.split("\\.");

        String[] noOfWord =sentence.split(" ");

        int noOfstatments=noOfStatments.length;
        String sentences = sentence.replace(" ","");
        int noOfWords =noOfWord.length;
        int noOfLetter =0;
        for (int i =0;i < sentences.length();i++) {
            char ch = sentences.charAt(i);
            noOfLetter++;
        }

      return new int[] {noOfstatments,noOfWords ,noOfLetter};

    }

    private static void printAndCalculateAverageSalaryOfIntern() {
        Intern[] intern = {new Intern("Saran", 10000),
                new Intern("Ashik", 13000),
                new Intern("Tharun", 11000),
                new Intern("subash",12000),
                new Intern("raj",14000)
        };

        double averageSalary;
        int total=0;
        for (Intern value : intern) {
            total += value.getSalary();
        }

        averageSalary = (double) total / intern.length;
        System.out.println("The Average Salary of All Intern : "+ averageSalary);
    }
}
