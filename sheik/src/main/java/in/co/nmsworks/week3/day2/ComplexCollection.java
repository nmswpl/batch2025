package in.co.nmsworks.week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexCollection
{
    private static Map<String , List<Integer[]>> cityToTempList = new HashMap<>();

    public static void main(String[] args) {
        List<Integer[]> chnList = new ArrayList<>();
        List<Integer[]> dinList = new ArrayList<>();
        List<Integer[]> tryList = new ArrayList<>();
        List<Integer[]> vilList = new ArrayList<>();
        cityToTempList.put("Chennai" , chnList);
        cityToTempList.put("Dindivanam" , dinList);
        cityToTempList.put("Trichy" , tryList);
        cityToTempList.put("Villupuram" , vilList);

    }
}
