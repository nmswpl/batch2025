/*
8. Write a Java method to convert a every word in a sentance to title case, where the first
letter of each word is capitalized.
  Input : "the quick brown fox jumps over the lazy dog";
  Output: "The Quick Brown Fox Jumps Over The Lazy Dog"
 */
package in.co.nmsworks.week1.day2.string;

public class CapatilizeTheFirstLetter {
    public static void main(String[] args) {
        String givenString = "my name is harish";
        captalizeTheFirstLetter(givenString);
    }

    public static void captalizeTheFirstLetter(String givenString){
        String[] splittedString = givenString.split(" ");
        String captalizedString = "";
        for (int i = 0; i < splittedString.length; i++){
            captalizedString = captalizedString + splittedString[i].substring(0,1).toUpperCase() +splittedString[i].substring(1) + " ";
        }
        System.out.println(captalizedString);
    }
}
