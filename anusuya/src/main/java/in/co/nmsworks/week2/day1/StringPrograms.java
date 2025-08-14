package in.co.nmsworks.week2.day1;

public class StringPrograms {

    public static void main(String[] args) {

        findCharacter("NMSWorks", 5);

        printLength("OpenAi");

        printSubStringFromBeginning("Java Programming", 5);

        printSubStringIncludesBeginningEnd("Welcome to Java", 11, 15);

        findSubString("Java Programming", "Prog");

        printConcatenatedStringUsingDelimeter(new String[]{"apple", "banana", "cherry"});

        checkEquality("hello", "Hello");

        checkEmpty(" ");

        printConcatenatedString("Hello", "World");

        replaceCharacter("banana", 'a', 'o');

        checkEqualityIgnoringCase("Hello", "hello");

        displaySplittedString("one,two,three");

        displaySplittedStringWithLimit("apple;banana;cherry;dates", 3);

        findFirstOccurence("Programming", "g");

        findFirstOccurenceWithBeginningIndex("Welcome to the world", "the", 10);

        printLowerCase("Java Programming");

        printUpperCase("Welcome Java");

        convertStringFromInt(1234);
    }

    public static void findCharacter(String word, int index){

        System.out.println(word + " at " + index + " is: " + word.charAt(index));
        System.out.println();
    }

    public static void printLength(String word){

        System.out.println(word + " length is : " + word.length());
        System.out.println();
    }

    public static void printSubStringFromBeginning(String word, int startingIndex){

        System.out.println(word + " substring from 5 is : " + (word.substring(startingIndex)));
        System.out.println();
    }

    public static void printSubStringIncludesBeginningEnd(String word, int startIndex, int endIndex){

        System.out.println(word + " substring from 11 to 15 is : " + (word.substring(startIndex, endIndex)));
        System.out.println();
    }

    public static void findSubString(String word, String searchWord){

        System.out.println(word + " contains  " + searchWord + " is :  " +word.contains(searchWord));
        System.out.println();
    }

    public static void printConcatenatedStringUsingDelimeter(String[] fruits){

        System.out.println("After Joining : " + String.join(",", fruits));
        System.out.println();
    }

    public static void checkEquality(String word1, String word2){

        System.out.println(word1 + " and " + word2 + " are : " + word1.equals(word2));
        System.out.println();
    }

    public static void checkEmpty(String word){

        System.out.println("Length of " + word + " is : " + word.length());
        System.out.println();
    }

    public static void printConcatenatedString(String word1, String word2){

        System.out.println(word1 + " and " + word2 + " = " + word1.concat(word2));
        System.out.println();
    }

    public static void replaceCharacter(String word, char oldChar, char newChar){

        System.out.println(word + " is replaced from " + oldChar + " to " + newChar + " is : " + word.replace(oldChar, newChar));
        System.out.println();
    }

    public static void checkEqualityIgnoringCase(String word1, String word2){

        System.out.println(word1 + " and " + word2 + " are by ignoring case : " + word1.equalsIgnoreCase(word2));
        System.out.println();
    }

    public static void displaySplittedString(String sentence){

        String[] splittedSentence = sentence.split(",");
        System.out.println("Before Splitting : " + sentence);
        System.out.print("After Splitting : ");

        for(int i = 0; i < splittedSentence.length; i++){
            System.out.print(splittedSentence[i] + "  ");
        }
        System.out.println();
    }

    public static void displaySplittedStringWithLimit(String sentence, int limit){

        String[] splittedSentence = sentence.split(";");
        System.out.println("Before Splitting : " + sentence);
        System.out.print("After Splitting : ");

        for(int i = 0; i < 3; i++){
            System.out.print(splittedSentence[i] + "  ");
        }
        System.out.println();
    }

    public static void findFirstOccurence(String word, String searchWord){

        System.out.println(word + " has " + searchWord + " at : " + word.indexOf(searchWord, 0));
        System.out.println();
    }

    public static void findFirstOccurenceWithBeginningIndex(String sentence, String searchWord, int fromIndex){

        System.out.println(sentence + " has " + searchWord + " at (Having specified Index): " + sentence.indexOf(searchWord, fromIndex));
        System.out.println();
    }

    public static void printLowerCase(String sentence){

        System.out.println(sentence + " to Lower Case is : " + sentence.toLowerCase());
        System.out.println();
    }

    public static void printUpperCase(String sentence){

        System.out.println(sentence + " to Upper Case is : " + sentence.toUpperCase());
        System.out.println();
    }

    public static void convertStringFromInt(int number){

        System.out.println(number + " value in String is : " + String.valueOf(number));
    }


}
