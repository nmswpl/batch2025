package in.co.nmsworks.week2.test.set1;

public class TestRunner {

    public static void main(String[] args) {

        String statement = "it is a title case conversion method";
        printTitleCase(statement);

    }

    public static void printTitleCase(String statement){

        String[] splittedStatement = statement.split(" ");
        System.out.println("Statement BEFORE converting into TITLE CASE : " + statement);
        System.out.println();
        System.out.print("Statement AFTER converting into TITLE CASE : ");
        for(int i = 0; i < splittedStatement.length; i++){
            System.out.print(splittedStatement[i].substring(0,1).toUpperCase() + splittedStatement[i].substring(1).toLowerCase() + " ");
        }
    }
}
