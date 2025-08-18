package in.co.nmsworks.week2.exam.set1;

/**
 * Question 3
 * Write a method that converts a given Statement to title case. In title case, the first letter of each
 * word is capitalized, and all other letters are in lowercase.
 */
public class ConvertTitleCase {

    public static void printTitleCase(String inputString){
        String [] inputArray = inputString.split(" ");
        String result = "";
        for (int i = 0 ; i < inputArray.length ; i++){
            result += inputArray[i].substring(0,1).toUpperCase() + inputArray[i].substring(1).toLowerCase() + " ";
        }
        System.out.println(result.trim());
    }

    public static void main(String[] args) {
        String input = "it is jaVa";
        printTitleCase(input);
    }
}
