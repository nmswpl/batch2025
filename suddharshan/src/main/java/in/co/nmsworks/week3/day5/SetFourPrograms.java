package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SetFourPrograms {
    public static void main(String[] args) {
        SetFourPrograms sfr = new SetFourPrograms();
        sfr.getFirstNonRepeatingChar("swiss");
        String news = "This book is a boring read,\n" + "but the review was exciting.";
    }
    public void getFirstNonRepeatingChar(String str){
        Map<Character,Integer> freqCount = new LinkedHashMap<>();
        for(int i = 0; i< str.length(); i++){
            freqCount.put(str.charAt(i),freqCount.getOrDefault(str.charAt(i),0)+1);
        }
        for (Map.Entry<Character, Integer> entry : freqCount.entrySet()) {
            if(entry.getValue() == 1){
                System.out.println("The first non-repeating character is: " + entry.getKey());
                break;
            }
        }
    }
    public void StringOperations(String str){
        String [] lines = str.split("\n");
        for (String line : lines) {
            String word [] = line.split(" ");
            
        }
    }
}

