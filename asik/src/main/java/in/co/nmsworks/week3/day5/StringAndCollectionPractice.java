package in.co.nmsworks.week3.day5;

public class StringAndCollectionPractice
{
    public static void main(String[] args)
    {
        StringAndCollectionPractice sc = new StringAndCollectionPractice();
        String ch = sc.getFirstNonRepeatedCharacter("swiss");
        System.out.println("The First Non-Repeated Character is " + ch);

        sc.textFormatterUtility("This book is a boring read, but the review was exciting.");

    }

    private void textFormatterUtility(String str)
    {
        String strRev = "";
        int len = str.length() - 1;

        while (len >= 0)
        {
            strRev += str.charAt(len);
            len--;
        }
        System.out.println("Reversed Text : " + strRev);
        System.out.println("UpperCase Text : " + str.toUpperCase());

        if (str.contains("exciting"))
        {
            System.out.println("This post is exciting!");
        }
        else
        {
            System.out.println("This post needs more energy!");
        }
        String replacedStr = str.replace("boring", "adventurous");
        System.out.println(replacedStr);

        String[] strArr = str.split(" ");
        String combined = "";
        for (String word : strArr)
        {
            System.out.println(word);
            combined += word + " ";
        }

        System.out.println("Combined Text : " + combined.trim());
    }

    private String getFirstNonRepeatedCharacter(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
            {
                return String.valueOf(str.charAt(i));
            }
        }
        return null;
    }
}
