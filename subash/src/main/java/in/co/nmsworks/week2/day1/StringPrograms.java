package in.co.nmsworks.week2.day1;

import java.util.Arrays;

public class StringPrograms {

    public static void main(String[] args) {

        String word="NMSWorks";
        int indexpos=5;
//        stringAtIndexpos(word,indexpos);

        String word2="openAI";
//        lengthOfString(word2);

        String word3="Java Programming";
        int beginindex=5;
//        extractAndPrintSubstring(word3,beginindex);

        String word4="Welcome to java";
        int begin=11;
        int end=15;
//        printStartToEnd(word4,begin,end);

        String word5="Java Programming";
        String substringword="Prog";
//        findSubstring(word3,substringword);

        String word7 = "hello";
        String word7one = "Hello";
//        compareTwoString(word7,word7one);

        String word8=" ";
//        checkForEmptyString(word8);

        String word9="Hello";
        String word9one="World";
//        concateStrings(word9,word9one);

        String word10="banana";
        String word10one="0";
//        replaceAllOccurence(word10,word10one);

        String word11="hello";
        String word11one="HELLO";
//        compareTwoStringsIgnoreCase(word11,word11one);

        String word12="One,Two,Three";
//        seperateWordsByDelimter(word12);

        String word13="apple;banana;cherry;date";
//        splitByLimit(word13);

        String word14="programming";
        String word14one="g";
        findOccurence(word14,word14one);


    }
    public static void stringAtIndexpos(String word,int indexpos)
    {
        System.out.println(word.charAt(indexpos));
    }

    public static void lengthOfString(String word2)
    {
        System.out.println(word2.length());
    }

    public static void extractAndPrintSubstring(String word3,int beginindex)
    {
        System.out.println(word3.substring(beginindex));
    }
    public static void printStartToEnd(String word4,int begin,int end)
    {
        System.out.println(word4.substring(11,15));
    }

    public static void findSubstring(String word5,String subStringword)
    {
        if(word5.contains(subStringword))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

    public static void compareTwoString(String word7,String word7one)
    {
        if(word7.equals(word7one))
            System.out.println("they are equal");
        else
            System.out.println("they are not equal");
    }

    public static void checkForEmptyString(String word8)
    {
        if(word8.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Not Empty");

    }

    public static void concateStrings(String word9,String word9one)
    {
        System.out.println(word9.concat(word9one));
    }

    public static void replaceAllOccurence(String word10,String word10one)
    {
        System.out.println(word10.replace("a","o"));
    }

    public static void compareTwoStringsIgnoreCase(String word11,String word11one)
    {
        if(word11.equalsIgnoreCase(word11one))
            System.out.println("They are Equal");
        else
            System.out.println("They are not equal");
    }

    public static void seperateWordsByDelimter(String word12)
    {
        String arr[]=word12.split(",");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print((arr[i]+" "));
        }

    }

    public static void splitByLimit(String word13)
    {
        String arr[]=word13.split(";",3);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void findOccurence(String word14,String word14one)
    {

        System.out.println(word14.indexOf(word14one));
    }


}
