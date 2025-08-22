package in.co.nmsworks.week3.day5;

import java.util.*;

public class StringsAndCollections {
    public static void main(String[] args) {
        StringsAndCollections sc = new StringsAndCollections();
        List <String> words = new ArrayList<>();
        words.add("eat");
        words.add("tea");
        words.add("tan");
        words.add("ate");
        words.add("nat");
        words.add("bat");

        sc.printGroupAnagrams(words);

        List<List<Integer>> numbers = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        numbers.add(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        numbers.add(list2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(5);
        list3.add(6);
        numbers.add(list3);
        sc.findCommonElements(numbers);

        int [][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        sc.getDiagonalSum(arr);

        int [] arr1 = new int[]{1,2,3};
        int [] arr2 = new int[]{2,3,4};
        System.out.println(sc.pairElements(arr1, arr2));

        Map<String, List<Integer>> empList = new HashMap<>();

        List<Integer> johnList = new ArrayList<>();
        johnList.add(8);
        johnList.add(9);
        johnList.add(7);
        johnList.add(8);
        empList.put("John",johnList);

        List<Integer> aliceList = new ArrayList<>();
        aliceList.add(9);
        aliceList.add(9);
        aliceList.add(8);
        aliceList.add(9);
        empList.put("Alice",aliceList);

        List<Integer> bobList = new ArrayList<>();
        bobList.add(7);
        bobList.add(8);
        bobList.add(7);
        bobList.add(7);
        empList.put("Bob",bobList);

        sc.trackEmployees(empList);
    }
    public void printGroupAnagrams (List <String> words){
        Map<String, List<String>> anagramsGroup = new HashMap<>();
        for (String word : words) {
            String copyWord = word;
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = "";
            for (char c : wordArr) {
                sortedWord += c;
            }
            if(anagramsGroup.containsKey(sortedWord)){
                List <String> list = anagramsGroup.get(sortedWord);
                list.add(copyWord);
                anagramsGroup.put(sortedWord,list);
            }
            else{
                List <String> list = new ArrayList<>();
                list.add(copyWord);
                anagramsGroup.put(sortedWord,list);
            }
        }
        System.out.println(anagramsGroup);
    }

    public void findCommonElements(List <List <Integer>> numbers){
        Set <Integer> initialList = new HashSet<>(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            Set <Integer> midList = new HashSet<>(numbers.get(i));
            initialList.retainAll(midList);
        }
        System.out.println(initialList);
    }

    public void getDiagonalSum(int arr[][]){
        int diagonalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j || (i+j) == arr[i].length-1){
                    diagonalsum += (arr[i][j] * arr[i][j] * arr[i][j]);
                }
            }
        }
        System.out.println("Diagonal Cube Sum Value: " + diagonalsum);
    }

    public List<List<Integer>> pairElements (int arr1[], int arr2[]){
        List<List<Integer>> pairs= new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if((arr1[i] + arr2[j]) % 2 == 0 ){
                    List<Integer> numList = new ArrayList<>();
                    numList.add(arr1[i]);
                    numList.add(arr2[j]);
                    pairs.add(numList);
                }
            }
        }
        return pairs;
    }

    public void trackEmployees (Map <String, List<Integer>> employees){
        Map <String, Integer> sumHrsListWithEmployee = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : employees.entrySet()) {
            List <Integer> workingHrs = entry.getValue();
            int sumHrs = 0;
            for (Integer hr : workingHrs) {
                sumHrs += hr;
            }
            sumHrsListWithEmployee.put(entry.getKey(), sumHrs);
        }

        int maxHrs = 0;
        for (Map.Entry<String, Integer> entry : sumHrsListWithEmployee.entrySet()) {
            if(entry.getValue() > maxHrs){
                maxHrs = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : sumHrsListWithEmployee.entrySet()) {
            if(entry.getValue() == maxHrs){
                System.out.println(entry.getKey() +" worked maximum hrs with " + entry.getValue());
            }
        }
    }
}
