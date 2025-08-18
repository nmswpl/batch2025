package in.co.nmsworks.week3.day1;

//Question 3
//Given a paragraph, write a method that returns an integer array (int[]) with the following
//information:
//        • 0th position: The number of statements in the paragraph.
//• 1st position: The total number of words in the paragraph.
//        • 2nd position: The total number of letter

public class Paragraphposition {

    public static void main(String[] args) {

        String str = "Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power.a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        String[] strArrForStatement = str.split(",");
        String[] strArrForWord = str.split(" ");

        int totalLetter = 0;

        for (int i=0; i<strArrForWord.length; i++) {
            int temp = strArrForWord[0].length();
            totalLetter = temp + totalLetter;
            temp = 0;
        }


        integerArray(strArrForStatement,strArrForWord,totalLetter);


//        System.out.println("Total statement count in given para :: " + strArrForStatement.length);
//        System.out.println("Total word count in given para :: " + strArrForWord.length);
//        System.out.println("Total number of letter in the para :: " + totalLetter);

    }

    private static void integerArray(String[] strArrForStatement, String[] strArrForWord, int totalLetter) {

        int[] paraIntArray = new int[3];

        paraIntArray[0] = strArrForStatement.length;
        paraIntArray[1] = strArrForWord.length;
        paraIntArray[2] = totalLetter;

        printIntArray(paraIntArray);

    }

    private static void printIntArray(int[] paraIntArray) {

        for (int i=0; i<paraIntArray.length; i++) {
            System.out.print(paraIntArray[i] + " ");
        }
    }

}
