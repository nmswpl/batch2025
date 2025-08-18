package in.co.nmsworks.week2.test.set1;

public class TestRunner {

    public static void main(String[] args) {

        String statement = "it is a title case conversion method";
        printTitleCase(statement);

        System.out.println();
        Intern anu = new Intern("Anu", "Software Developer");
        Intern kavi = new Intern("Kavi", "Software Developer");
        Intern harish = new Intern("Harish", "Designer");
        Intern logeshwari = new Intern("Logeshwari", "Software Developer");
        Intern viji = new Intern("Viji", "Technical Support");

        Intern[] internsArray;
        internsArray = new Intern[]{anu,kavi, harish, logeshwari, viji};

        int[] selctedDepartmentIndices = getIndicesOfSelectedDepartment(internsArray);

        System.out.print("Interns having Software Developer : ");
        for (int i = 0; i < selctedDepartmentIndices.length; i++){
            System.out.print(selctedDepartmentIndices[i] + "  ");
        }
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

    private static int[] getIndicesOfSelectedDepartment(Intern[] internsArray) {

        int k = 0;
        int[] temp = new int[internsArray.length];
        for (int i =  0; i < internsArray.length; i++){
            if(internsArray[i].getDept().equals("Software Developer")){
                temp[k++] = i;
            }
        }
        return temp;
    }
}
