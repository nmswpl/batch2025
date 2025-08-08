package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("aabbcc");

    }

    public static void removeDuplicates(String input){
        String result="";
        for(int i=0;i<input.length()-1;i++){
            char ch=input.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }

        }
        System.out.println(result);

    }
}
