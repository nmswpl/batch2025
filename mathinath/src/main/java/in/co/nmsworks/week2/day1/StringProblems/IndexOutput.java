package in.co.nmsworks.week2.day1.StringProblems;

public class IndexOutput {
    public static void main(String[] args) {
        new IndexOutput().printString("NMSWorks",5);
        new IndexOutput().printLength("OpenAI");
        new IndexOutput().printSubstringBegin("Java Programming",5);
        new IndexOutput().printSubstringBeginEnd("Java Programming",11,15);
        new IndexOutput().compareString("Java Programming","Prog");
        new IndexOutput().printStringJoin(",","apple","banana","cherry");
        new IndexOutput().compareAndPrint("hello","Hello");
        new IndexOutput().checkEmpty(" ");
        new IndexOutput().concateString("Hello","World");
        new IndexOutput().replaceString("banana");
        new IndexOutput().printStringIgnoreCase("hello","HELLO");
        new IndexOutput().splitsString("one,two,three");
        new IndexOutput().splitsStringLimits("apple;banana;cherry;date");
        new IndexOutput().printIndex("programming","g");
        new IndexOutput().printIndexStart("welcome to the world","the",10);
        new IndexOutput().printLowerCase("Java Programming");
        new IndexOutput().printUpperCase("welcome to Java");
        new IndexOutput().convertIntToString(1234);

    }
    public void printString(String str, int num)
    {
        System.out.println(str.indexOf(num));

    }
    public void printLength(String str)
    {
        System.out.println(str.length());
    }
    public void printSubstringBegin(String str,int num)
    {
        System.out.println(str.substring(num));
    }
    public void printSubstringBeginEnd(String str, int num1,int num2)
    {
        System.out.println(str.substring(num1,num2));
    }
    public void compareString(String str1,String str2)
    {
       if(str1.contains(str2))
       {
           System.out.println("found");
       }
       else
       {
           System.out.println("not found");
       }
    }
    public void compareAndPrint(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
    public void checkEmpty(String str)
    {
        if(str.isEmpty())
        {
            System.out.println("empty");
        }
        else
        {
            System.out.println("not empty");
        }

    }
    public void concateString(String str1,String str2)
    {
        System.out.println(str1+str2);
    }
    public void replaceString(String str)
    {
        System.out.println(str.replace('a','o'));
    }
    public void printStringJoin(String str1,String str2,String str3,String str4)
    {
        System.out.print(String.join(str1,str2,str3,str4));
        System.out.println();
    }
    public void printStringIgnoreCase(String str1,String str2)
    {
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("they are equal");
        }
        else
        {
            System.out.println("not equal");
        }
    }
    public void splitsString(String str)
    {
        String[] arr=str.split(",");
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void splitsStringLimits(String str)
    {
        String[] arr=str.split(";",3);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void printIndex(String str1,String str2)
    {
        int index=str1.indexOf(str2);
        System.out.println(index);
    }
    public void printIndexStart(String str1,String str2,int num)
    {
        System.out.println(str1.indexOf(str2,num));
    }
    public void printLowerCase(String str)
    {
        System.out.println(str.toLowerCase());
    }
    public void printUpperCase(String str)
    {
        System.out.println(str.toUpperCase());
    }
    public void convertIntToString(int num)
    {
        String str=String.valueOf(num);
        System.out.println(str);
    }
}
