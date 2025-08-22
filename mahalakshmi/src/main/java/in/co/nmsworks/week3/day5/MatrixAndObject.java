package in.co.nmsworks.week3.day5;

import java.util.*;

public class MatrixAndObject {
    
    public int findSumOfMatrix(int[][] mat) {
        int sum = 0;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

    public void trackingStudentGrades(Map<String,Integer[]> studGrades) {
        String name = "";
        float avg = 0.00f, high = 0.00f;
        for (Map.Entry<String, Integer[]> entry : studGrades.entrySet()) {
            float sum = 0.00f;
            Integer[] arr = entry.getValue();
            for (Integer i : arr) {
                System.out.print(i + "\t");
                sum += i;
            }
            avg =  (float) (sum/arr.length);
            high = Math.max(avg, high);
            name = entry.getKey();
            System.out.println(entry.getKey() + " :  Average = " + avg);
        }
        System.out.println("Highest average: " + name + " (" + high + ")");
    }

    public int[] retrieveElementIn2DArray(List<List<Integer>> mat, int target) {
        int[] pos = new int[2];
        for(int i = 0 ; i < mat.size() ; i++) {
            List<Integer> row = mat.get(i);
            for (int j = 0 ; j < row.size() ; j++) {
                if(target == row.get(j)) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }

    public List<Integer> printSpiral(int[][] arr) {
        List<Integer> spiral = new ArrayList<>();
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while ((rowStart <= rowEnd) && (colStart <= colEnd)) {
            for (int i = colStart; i <= colEnd; i++) {
                spiral.add(arr[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                spiral.add(arr[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= 0; i--) {
                    spiral.add(arr[rowEnd][i]);
                }
                rowEnd--;

                if (colStart <= colEnd) {
                    for (int i = rowEnd; i >= rowStart; i--) {
                        spiral.add(arr[i][colStart]);
                        colStart++;
                    }
                }
            }
        }
        return spiral;
    }

    public Map<String, List<String>> groupAnagrams(List<String> list) {
        Map<String,List<String>> anagrams = new HashMap<>();
        for (String s : list) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            anagrams.putIfAbsent(str,new ArrayList<>());
            anagrams.get(str).add(s);
        }
        return anagrams;
    }

    public void findCommonElement(List<List<Integer>> elements) {
        Set<Integer> unique = new HashSet<>(elements.get(0));
        for (int i = 0; i < elements.size(); i++) {
            unique.retainAll(elements.get(i));
        }
        System.out.println(unique);
    }

    public int findSumOfDiagonal(int[][] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr[i].length ; j++) {
                if((i == j) || ((i == 0) && (j == arr.length-1)) || (i == arr.length-1) && (j == 0)) {
                    sum = sum + (int) Math.pow(arr[i][j], 3);
                }
            }
        }
        return sum;
    }

    public List<List<Integer>> pairingElements(int[] arr1, int[] arr2) {
        List<List<Integer>> paired = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                List<Integer> list = new ArrayList<>();
                int sum = arr1[i]+arr2[j];
                if(sum % 2 == 0) {
                    list.add(arr1[i]);
                    list.add(arr2[j]);
                    paired.add(list);
                }
            }
        }
        return paired;
    }

    public void buildEmployeeAttendance() {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer[]> employee = new HashMap<>();
        System.out.println("Enter the no of Employees: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            System.out.println("Enter the name of the Employee: ");
            String name = sc.next();
            Integer[] hours = new Integer[4];
            System.out.println("Enter the no of hours worked each day: ");
            for(int j = 0 ; j < hours.length ; j++) {
                hours[j] = sc.nextInt();
            }
            employee.put(name,hours);
        }

        for (Map.Entry<String, Integer[]> entry : employee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + Arrays.toString(entry.getValue()));
        }
        int max = 0;
        int[] totalHours = new int[3];
        String highPayName = "";
        for (Map.Entry<String, Integer[]> entry : employee.entrySet()) {
            int sum = 0;
            Integer[] temp = entry.getValue();
            for (Integer i : temp) {
                sum += i;
            }
            if(sum > max) {
                max = sum;
                highPayName = entry.getKey();
            }
        }
        System.out.println(highPayName + " worked the most hours: " + max + "hours");
    }
}
