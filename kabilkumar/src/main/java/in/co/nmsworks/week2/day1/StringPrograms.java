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

        String usingLimit = " apple;banana;graphs,cherry";
        usingLimtCondition(usingLimit);

        String getSentenseOcc = "programming";
        firstoccurance(getSentenseOcc);

        String findValue = "Welcome to the word";
        findValueInSen(findValue);

        String captial = "JAVA PROGRAMING";
        String small = "java programming";
        convertToLower(captial , small);

        int num=123;
        convertIntToStr(num);

        String name1 = "apple";
        String name2 = "banana";
        displayWithJoin(name1,name2);

    }
 public static void displayWithJoin(String getNmae1,String getNmae2)
 {
     System.out.println();
 }
    public static void convertIntToStr(int datnum)
    {
        System.out.println(String.valueOf(datnum));
    }
    public static void convertToLower(String toCaptial,String toSmall)
    {
        System.out.println(toCaptial.toLowerCase());
        System.out.println(toSmall.toUpperCase());
    }

    public static void findValueInSen(String getFindValue)
    {
        System.out.println(getFindValue.indexOf("the" , 10));

    }
    public static void firstoccurance(String occurance)
    {
        System.out.println(occurance.indexOf('g'));
    }

    public  static void usingLimtCondition(String limit)
    {
        System.out.println("split using limit:");
        String[] wordslimit = limit.split(";",3);
        for (int i = 0; i < wordslimit.length; i++)
        {
            System.out.println(wordslimit[i]);

        }

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
        System.out.println(data.charAt(5));
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
