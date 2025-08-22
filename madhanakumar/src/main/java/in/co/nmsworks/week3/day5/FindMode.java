package in.co.nmsworks.week3.day5;

import java.util.HashMap;
import java.util.Map;

public class FindMode {
    public static void main(String[] args) {
        FindMode findMode = new FindMode();
        findMode.getMode();
    }

    private void getMode() {
        Map<Integer,Integer> modeMap = new HashMap();
        int[] array = new int[]{4,4,7,7,7,1,1,8};
        for (int num : array) {
            modeMap.put(num, modeMap.getOrDefault(num,0)+1);
        }
        int mode = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : modeMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Mode : "+mode+", MaxCount : "+maxCount);
    }
}
