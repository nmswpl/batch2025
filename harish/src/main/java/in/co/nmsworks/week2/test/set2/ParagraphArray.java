package in.co.nmsworks.week2.test.set2;

public class ParagraphArray {
    public static void main(String[] args) {
        String paragraph = "This is the paragraph . And It will be defined.";
        int[] paraDetailsArray = new int[3];
        paraDetailsArray[0] = numberOfSentence(paragraph);
        paraDetailsArray[1] =  totalNumberOfWords(paragraph);
        paraDetailsArray[2] =  totalNumberOfLetters(paragraph);
        System.out.println("The number of sentences " + paraDetailsArray[0]);
        System.out.println("The number of words " +paraDetailsArray[1]);
        System.out.println("The number of letters " +paraDetailsArray[2]);

    }

    private static int numberOfSentence(String paragraph) {
        String[] splittedPara = paragraph.split("\\.");
        return splittedPara.length;
    }


    public static int totalNumberOfWords(String paragraph) {

        String[] splittedParaUsingSpace = paragraph.split(" ");
        int letterCount = 0;
        for (int i = 0 ; i < splittedParaUsingSpace.length ; i++ ){

            letterCount = splittedParaUsingSpace[0].length() + letterCount;
        }
        return splittedParaUsingSpace.length;

    }

    private static int totalNumberOfLetters(String paragraph) {

        String[] splittedParaUsingSpace = paragraph.split(" ");
        int letterCount = 0;
        for (int i = 0 ; i < splittedParaUsingSpace.length ; i++ ){

            letterCount = splittedParaUsingSpace[0].length() + letterCount;
        }
        return letterCount;
    }

}
