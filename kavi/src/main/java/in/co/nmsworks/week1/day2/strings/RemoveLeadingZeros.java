package in.co.nmsworks.week1.day2.strings;
//4.Given a number as String, write a program that removes the leading 0
//Input :
//0005640
//output:
//5640
public class RemoveLeadingZeros {
    public static void main(String[] args) {
        printRemoveLeading();
    }

    public static void printRemoveLeading()

    {
        String input = "0005604";
        String output = input.replaceFirst("^0+", "");
        System.out.println("output" + output);
    }
}

