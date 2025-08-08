package in.co.nmsworks.week1.day2.string;

public class LeadingZero {

    public static void main(String[] args) {

         String str = "0005430";
         printNonZero(str);
    }

    private static void printNonZero(String str) {

            String word = "";
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != '0'){
                    System.out.println(str.substring(i));
                    break;
                }
            }
    }
}
