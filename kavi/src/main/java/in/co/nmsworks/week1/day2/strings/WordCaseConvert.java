package in.co.nmsworks.week1.day2.strings;
//8.Write a Java method to convert a every word in a sentance to title case, where the first
//letter of each word is capitalized.
public class WordCaseConvert{
    public static void main(String[] args) {

    }
    public static String printWordCaseConvert(String str){
        String result="";
        boolean newWord=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch ==' '){
                result=result+ch;
                newWord=true;
            }
            else{
                if(newWord && ch>='a' && ch<='z'){
                    result=result+(char)(ch-32);
                }
                else{
                    result=result+ch;
                }
                newWord=false;
            }
        }
        return result;
    }

}