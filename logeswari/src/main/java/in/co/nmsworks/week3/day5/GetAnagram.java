package in.co.nmsworks.week3.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAnagram {

    public static void printAnagram(){
        List<String[]> anagram=new ArrayList<>();
        anagram.add(new String[]{"eat","tea","tan","ate","nat","bat"});
        String eat = "eat";
        for(String[] word:anagram){
            Arrays.sort(word);
            if(word.equals(eat)){
                System.out.println("It is a anagram ");

            }


        }
        boolean c1 =anagram.contains("eat");
        System.out.println("it contain "+c1);

    }

    public static void main(String[] args) {
        printAnagram();

    }
}
