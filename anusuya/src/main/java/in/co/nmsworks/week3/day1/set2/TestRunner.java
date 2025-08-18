package in.co.nmsworks.week3.day1.set2;

public class TestRunner {

    public static void main(String[] args) {

        String statement = "The quick brown fox jumped over the lazy dog. It was a sunny day. The dog barked loudly.";
        int[] count = countAndGetArray(statement);
        System.out.println("No of Statements : " + count[0]);
        System.out.println("No of Words : " + count[1]);
        System.out.println("No of Letters without considering dot(.): " + count[2]);

        NewIntern anu = new NewIntern("Anu", 15000);
        NewIntern kavi = new NewIntern("Kavi", 20000);
        NewIntern logi = new NewIntern("Logi", 18000);
        NewIntern viji = new NewIntern("Viji", 25000);

        NewIntern[] newInterns = {anu, kavi, logi, viji};

        printAverageSalary(newInterns);
    }

    private static int[] countAndGetArray(String statement){

        int[] temp = new int[3];
        String[] splittedStatementByLine = statement.split("\\.");
        temp[0] = splittedStatementByLine.length;

        String[] splittedStatementBySpace = statement.split(" ");
        temp[1] = splittedStatementBySpace.length;

        int letterCount = 0;
        for (String word : splittedStatementBySpace) {
            letterCount += word.length();
        }
        temp[2] = letterCount- splittedStatementByLine.length;
        return temp;
    }

    private static void printAverageSalary(NewIntern[] newInterns) {

        int sumOfSalary = 0;
        for (NewIntern newIntern : newInterns) {
            sumOfSalary += newIntern.getSalary();
        }
        System.out.println("Average salary of New Interns is " + (int)sumOfSalary/ newInterns.length);
    }

}
