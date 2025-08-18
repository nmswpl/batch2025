package in.co.nmsworks.week2.test.even;
//question3
public class Paragraph {

        public static int[] Paragraph(String paragraph) {
            int statementCount = 0;
            int wordCount = 0;
            int letterCount = 0;


            if (paragraph == null || paragraph.trim().isEmpty()) {
                return new int[3];
            }
            for (char c : paragraph.toCharArray()) {
                if (c == '.' || c == '!' || c == '?') {
                    statementCount++;
                }
                if (Character.isLetter(c)) {
                    letterCount++;
                }
            }

            String[] words = paragraph.trim().split("s+");
            wordCount = words.length;

            return new int[]{statementCount,wordCount, letterCount};
        }

        public static void main(String[] args) {
            String paragraph = "Java is great";
            int[] result = Paragraph(paragraph);

            System.out.println("Statements: " + result[0]);
            System.out.println("Words: " + result[1]);
            System.out.println("Letters: " + result[2]);
        }


}
