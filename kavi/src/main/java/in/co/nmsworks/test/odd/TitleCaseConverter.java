package in.co.nmsworks.test.odd;

public class TitleCaseConverter {
        public static String toTitleCase(String statement) {
            String[] words = statement.split(" ");
            String result = "";


            for (String word : words) {
                if (word.length() > 0) {
                    result += word.substring(0, 1).toUpperCase() +
                            word.substring(1).toLowerCase();
                }
            }
            return result.trim();
        }



        public static void main(String[] args) {
            String input = "this is a sample statement";
            System.out.println(toTitleCase(input));
        }



}
