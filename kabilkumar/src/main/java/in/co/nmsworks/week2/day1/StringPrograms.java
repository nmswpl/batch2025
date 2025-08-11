package in.co.nmsworks.week2.day1;

public class StringPrograms
{
    public static void main(String[] args) {
        String dataGiven = "NMSWorks";
        indexOfTheString(dataGiven);

        String lengthOfTheString = "OpenAi";
        findLength(lengthOfTheString);

        String specficWord = "Java Programing";
        findSpecficWord(specficWord);

        String indexingWord = " java Programing";
        beginingAndEndingIndex(indexingWord);

        String findWord = "Java Programing" ;
        String subString = " prog";
        findWordPresent(findWord , subString);

        String compareString1  = "hello";
        String compareString2 = "Hello";
        stringCompare(compareString1,compareString2);

        String setName=" java";
        emptyOrNot(setName);

        String strFirst= "hai  ";
        String strSecond = "hello";
        concadate(strFirst,strSecond);


        String strName = "banana";
        replace(strName);

        String string1 = "hello";
        String string2 = "Hello";
        ignoreCase(string1,string2);

        String givenString = "one,two,three";
        subString(givenString);

    }
    public  static  void subString(String words)
    {
        String[] splitWord = words.split(",");
        for (int i = 0; i < splitWord.length; i++) {
            System.out.println(splitWord[i]);
        }
    }
    public  static void ignoreCase(String name1,String name2)
    {
        System.out.println(name1.equals(name2));
    }
    public  static void  replace(String name)
    {
        System.out.println(name.replace('a','o'));
    }
    public  static void concadate(String str1,String str2)
    {
        System.out.println(str1.concat(str2));
    }

    public  static void  emptyOrNot(String dataGet)
    {
        dataGet.isEmpty();

    }
    public  static void stringCompare(String str1,String str2)
    {
        System.out.println(str1.equals(str2));
    }

    public static void indexOfTheString(String data)
    {
        System.out.println(data.indexOf(5));
    }
    public  static void beginingAndEndingIndex(String indexOfstartandend )
    {
        System.out.println(indexOfstartandend.substring(11,15));
    }
    public static void findWordPresent(String wordPresent ,String search)
    {
        //System.out.println(int indexof = search.indexOf() == wordPresent.indexOf());
    }

    public static void findLength(String getString)
    {
        System.out.println(getString.length());
    }

    public static void findSpecficWord(String getWord)
    {
        System.out.println(getWord.substring(5));
    }
}
