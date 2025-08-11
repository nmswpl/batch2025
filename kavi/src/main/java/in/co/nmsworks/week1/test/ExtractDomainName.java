package in.co.nmsworks.week1.test;

public class ExtractDomainName {

    static String splitDomainName(String str, String delimeter)
    {
        String finalOutput = "";
        String arrayOfStr[] = str.split(delimeter);
        if (arrayOfStr.length == 2) {
            finalOutput = arrayOfStr[1];
        }
        return finalOutput;
    }

    public static void main(String args[])
    {
        String str = "john.doe@gmail.com";

        String deleimeter = "@";
        System.out.println("The original string is :" + str);
        System.out.println("The extracted domain name :" + splitDomainName(str, deleimeter));
    }
}
