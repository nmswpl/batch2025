package in.co.nmsworks.week1.day2.string.First;
//Write a Java program to remove duplicate characters from a string while preserving the
//order of the first occurrences.
//        Input: "aabbcc"
//Output: "abc"



public class RemoveDduplicate {
    static void removingDuplicateLetter(){
        String input="aabbcc";
        String result="";
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        removingDuplicateLetter();
    }

}
