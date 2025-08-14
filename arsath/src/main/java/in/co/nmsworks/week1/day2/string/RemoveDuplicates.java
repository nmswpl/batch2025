package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicates {
    public static void removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("");
            return;
        }

        String result = "";
        result += input.charAt(0); // first char is always added

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result += input.charAt(i);
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String input = "aaabbcc";
        removeDuplicates(input); // Output: abc
    }
}
