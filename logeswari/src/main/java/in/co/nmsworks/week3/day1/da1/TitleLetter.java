package in.co.nmsworks.week3.day1.da1;

import java.util.Arrays;

public class TitleLetter {
    public static void printCaps() {
        String input = "hello Logeswari welcome to dev";
        StringBuffer[] result = new StringBuffer[]{new StringBuffer(input)};
        Arrays.stream(result).spliterator();
        System.out.println(Arrays.toString(result));
        for(StringBuffer w:result){
            w.charAt(Character.toUpperCase(0));
            System.out.println("word : "+w.toString());
            input.charAt(0);
        }



        }

    public static void main(String[] args) {
        printCaps();

    }
    }


