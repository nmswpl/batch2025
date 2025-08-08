package in.co.nmsworks.week1.day2.string;

public class SentenceInNewLine
{
    public static void main(String[] args) {
        String para = "This is my file.lets write a program.practice coding helps";
        printInNewLine(para);

    }
    public static void printInNewLine(String para){
        String[] nl = para.split("\\.");
        for(int i = 0; i < nl.length;i++){
            System.out.println(nl[i]);
        }
    }
}