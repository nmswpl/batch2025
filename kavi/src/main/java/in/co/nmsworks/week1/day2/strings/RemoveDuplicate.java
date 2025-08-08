package in.co.nmsworks.week1.day2.strings;
//7.Write a Java program to remove duplicate characters from a string while preserving the
//order of the first occurrences.
public class RemoveDuplicate {
    public static void main(String[] args) {
        printRemoveDuplicate();
    }
    public static void printRemoveDuplicate(){

                String input = new String("aabbc");
                String output = new String();

                for (int i = 0; i < input.length(); i++) {
                    for (int j = 0; j < output.length(); j++) {
                        if (input.charAt(i) != output.charAt(j)) {
                            output = output + input.charAt(i);
                        }
                    }
                }

                System.out.println(output);
    }
}
