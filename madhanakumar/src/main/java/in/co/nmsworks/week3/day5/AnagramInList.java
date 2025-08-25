package in.co.nmsworks.week3.day5;

import java.util.*;

public class AnagramInList {
    public static void main(String[] args) {
        AnagramInList anagramInList = new AnagramInList();
        anagramInList.printAnagram();
    }

    private void printAnagram() {
        Map<String, List<String>> map = new HashMap<>();
        String[] words = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(ch)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }

        for(Map.Entry<String,List<String>> entry : map.entrySet()){

        }
    }
}
