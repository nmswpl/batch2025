package in.co.nmsworks.week2.test.set1;

public class TestRunner {
    public static void main(String[] args) {
        convertStatementToTitleCase("this is my java program");
        Intern intern1 = new Intern("Yamini", "IT");
        Intern intern2 = new Intern("Viji", "CSE");
        Intern intern3 = new Intern("Sheik", "IT");
        Intern intern4 = new Intern("Vijay", "CSE");
        Intern intern5 = new Intern("Vikas", "IT");
        Intern[] array = {intern1, intern2, intern3, intern4, intern4, intern5};
        System.out.println();
        System.out.println(returnIndices(array));
    }

    public static void convertStatementToTitleCase(String input) {
        String[] arr = input.split(" ");
        for (String words : arr) {
            System.out.print(words.substring(0, 1).toUpperCase() + words.substring(1, words.length()).toLowerCase() + " ");
        }
    }

    public static int[] returnIndices(Intern[] array) {

        int[] arr = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getDept() == "CSE") {
                arr = new int[]{i};
            }
        }
        return arr;
    }

}




