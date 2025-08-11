package in.co.nmsworks.week1.test;

import java.util.Arrays;

public class ExtractDomainName {

    public static void main(String[] args) {

        String input="yqfhweweoweobejo@gmail.com";
        extractGmail(input);

    }

    public static void extractGmail(String input)
    {
        int position=0;
        if(input.contains("@"))
        {
            position = input.indexOf("@");
            System.out.println(input.substring(position));
        }
        else
            System.out.println("No domain Found");


    }
}
