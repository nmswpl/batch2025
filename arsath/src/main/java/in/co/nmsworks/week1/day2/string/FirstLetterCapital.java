package in.co.nmsworks.week1.day2.string;

public class FirstLetterCapital {
    public static String toTitleCase(String sentence) {
        sentence = sentence.toLowerCase();
        String[] words = sentence.split(" ");

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String capitalized = words[i].substring(0, 1).toUpperCase() +
                        words[i].substring(1);
                result += capitalized + " ";
            }
        }
        return result.trim(); // remove extra space at the end
    }

    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog";
        String output = toTitleCase(input);
        System.out.println(output);
    }
}