package in.co.nmsworks.week1.day2.string;

/**
 * Write a Java program to remove duplicate characters from a string while preserving the order of the first occurrences.
 * Input: "aabbcc"
 * Output: "abc"
 */
public class RemoveDuplicate {
    static void removeDuplicate(String value){
        String [] valueArray=value.split("");
        String result="";;
        for(int i=0;i<value.length()-1;i++){
            if(!result.contains(valueArray[i])){
                result += valueArray[i];
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        removeDuplicate("aabbcc");
    }
}
