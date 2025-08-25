package in.co.nmsworks.week3.day1.test.set1;


import java.util.Arrays;

public class TestRunnerSetOne
{
    private String name;
    private String dept;

    public TestRunnerSetOne(String name, String dept) {
        this.dept = dept;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
    public static int[] printIndices(TestRunnerSetOne[] intern){
        int arr [] = new int[3];
        int index =0;
        for(int i=0;i< intern.length;i++){
            if((intern[i].getDept()).equals("DEV")){
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TestRunnerSetOne internOne = new TestRunnerSetOne("Fayas" , "DEV");
        TestRunnerSetOne internTwo = new TestRunnerSetOne("Arun" , "QA");
        TestRunnerSetOne internThree = new TestRunnerSetOne("Ram" , "DEV");
        TestRunnerSetOne internFour = new TestRunnerSetOne("Som" , "QA");
        TestRunnerSetOne internFive = new TestRunnerSetOne("Gokul" , "DEV");

        TestRunnerSetOne intern[] = {internOne,internTwo,internThree,internFour,internFive};

        int arr[] = printIndices(intern);
        System.out.println("index of dev dept:");
        System.out.println(Arrays.toString(arr));

        String title = "java is the popular programming language";
        System.out.println("Tile Case:");
        printIntoTitleCase(title);

    }
    public static void printIntoTitleCase(String title){
        for(int i=0;i<title.length();i++){
            if(i==0 || title.charAt(i-1) == ' '){
                System.out.print(Character.toUpperCase(title.charAt(i)));
            }
            else{
                System.out.print(title.charAt(i));
            }
        }
    }
}
