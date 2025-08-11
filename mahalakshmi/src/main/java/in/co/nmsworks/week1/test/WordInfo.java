package in.co.nmsworks.week1.test;

public class WordInfo {
    public static void main(String[] args) {
        String str = "Java is a popular programming language";
        printWordInfo(str,"popular");
    }

    public static void printWordInfo(String str, String target) {
        String res = "";
        int index = 0;
        String[] splitArr = str.split(" ");
        for(int i = 0 ; i < splitArr.length ; i++) {
            if(splitArr[i].equals(target)){
                res = splitArr[i];
                index = i;
            }
        }
        System.out.println("Word found at index: " + index);
        System.out.println("First character of the word: " + res.charAt(0));
        System.out.println("Last Character of the word: "+ res.charAt(res.length()-1));
    }
}
