package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class ModeFinder {

    public static void main(String[] args) {

        ModeFinder mf = new ModeFinder();

        mf.printElementWithHighestFrequency(new int[]{4,7,7,7,1,8});
    }

    private void printElementWithHighestFrequency(int[] numbers) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int number : numbers) {
            frequency.put(number, frequency.getOrDefault(number, 0) + 1);
        }

        int value = 1;
        int key = 1;
        for (Map.Entry<Integer, Integer> frequentNumber : frequency.entrySet()) {
            if(frequentNumber.getValue() > value){
                value = frequentNumber.getValue();
                key = frequentNumber.getKey();
            }
        }
        System.out.println(key + " is occurend at " + value + " times");
    }
}
