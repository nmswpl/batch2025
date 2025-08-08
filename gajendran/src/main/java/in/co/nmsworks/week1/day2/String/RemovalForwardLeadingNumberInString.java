package in.co.nmsworks.week1.day2.String;



//4. Given a number as String, write a program that removes the leading 0
//Input :
//0005640
//output:
//5640





public class RemovalForwardLeadingNumberInString {

    public static StringBuffer getRemovalForwardLeadingNumberInString(char charWantToRemove, String contentToEdit){

        StringBuffer ans = new StringBuffer();
        int len = contentToEdit.length();
        for (int i = 0; i < len; i++){
            if(contentToEdit.charAt(i) == charWantToRemove){
                continue;
            }
            else {
                while(i < len){
                ans.append(contentToEdit.charAt(i));
                i++;
                }
                return ans;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
    System.out.println(getRemovalForwardLeadingNumberInString('0', "005670700"));

    }

}
