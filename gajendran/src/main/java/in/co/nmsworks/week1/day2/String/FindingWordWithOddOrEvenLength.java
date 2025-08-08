package in.co.nmsworks.week1.day2.String;


//3. Given a string str, write a Java program to print all words with even length in the given
//string.
//Input
//: s = "This is a java language"
//Output
//: This
//is
//java
//language



public class FindingWordWithOddOrEvenLength {

    public static void printingAWordWithOddOrEvenLength(int oddOrEven, String content){

        if (oddOrEven == 0 || oddOrEven > 2){
            System.out.println("Give a integer value as 1 or 2");
            return;
        }

        String[] splitContent = content.split(" ");
        for(String i : splitContent){
            if (((i.length() % 2 ) == 0) && (oddOrEven == 2)){
                System.out.println(i);
            } else if (((i.length() % 2 ) == 1) && (oddOrEven == 1)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Gajendran is Working At NMSWorks";
        printingAWordWithOddOrEvenLength(2,str); // 1 mean odd    2 mean even
    }

}
