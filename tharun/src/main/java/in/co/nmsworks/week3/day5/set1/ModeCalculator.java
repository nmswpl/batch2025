package in.co.nmsworks.week3.day5.set1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ModeCalculator {
    public static void main(String[] args) {
        ModeCalculator modeCalculator = new ModeCalculator();
        int [] inputArray = {1,3,1,1,5,7,3,3,3,4,4,42,2};
        System.out.println("Mode of "+ Arrays.toString(inputArray)+" array is : "+modeCalculator.findMode(inputArray));
    }

    private int findMode(int[] inputArray) {
        Map<Integer,Integer> numberAndItsOccurence = new HashMap<>();
        for (int number : inputArray) {
            numberAndItsOccurence.put(number, numberAndItsOccurence.getOrDefault(number,0)+1);
        }
        System.out.println(numberAndItsOccurence);
        int maxValue = 0;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : numberAndItsOccurence.entrySet()) {
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }
}
