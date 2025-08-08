package in.co.nmsworks.week1.day2.string;

/**
 * Given a number as String, write a program that removes the leading 0
 * Input :
 * 0005640
 * output:
 * 5640
 */
public class RemoveLeadingZeros {
    static void removeLeadingZeros(String value){
        for(int i=0;i<value.length();i++){
            if(value.charAt(i)!='0'){
                System.out.println(value.substring(i));
                break;
            }
        }
    }
    public static void main(String[] args) {
        removeLeadingZeros("0005640");
    }
}
