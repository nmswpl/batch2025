package in.co.nmsworks.week1.day2.strings;
//9.Write a Java method to find the longest word in a given sentence.
public class LongestWord {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        System.out.println(findLongestWord(s));
    }
    public static String findLongestWord(String s){
        String longest="";
        String current="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                current=current+ch;
            }
            if(ch==' '||i==s.length()-1){
                if(current.length()>longest.length()){
                    longest=current;
                }
                current= "";

            }
        }
        return longest;
    }

}
