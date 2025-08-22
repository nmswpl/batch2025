package in.co.nmsworks.week3.day5;


import java.util.*;

public class ArraysPractice
{
    public static void main(String[] args)
    {
        ArraysPractice ap = new ArraysPractice();

        int[][] arr = new int[][] {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int sum = ap.sumOf2DArray(arr);
        System.out.println("Sum Of The 2D Array is " + sum);

        Student john = new Student("John", new int[] {85, 90, 88});
        Student alice = new Student("Alice", new int[] {90, 91, 92});
        Student bob = new Student("Bob", new int[] {70, 75, 80});

        Student[] students = {john, alice, bob};

        Student highestGradeStudent = ap.getHighestGrade(students);
        System.out.println("The Highest Average : " + highestGradeStudent.getName() + " (" + highestGradeStudent.getAvgGrade() + ")");

        List<List<Integer>> arrList = new ArrayList<>();
        arrList.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arrList.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        arrList.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        int target = 5;
        int[] index = ap.getIndexOfTargetElement(arrList, target);
        System.out.println("The Index of Element " + target + " is Found At Index " + "(" + index[0] + ", " + index[1] + ")");
        List<Integer> list = ap.convertSpiralToList(arr);
        System.out.println(list);

        ap.printGroupAnagram(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});

        List<List<Integer>> arrListWithRepeatedValues = new ArrayList<>();
        arrListWithRepeatedValues.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        arrListWithRepeatedValues.add(new ArrayList<>(Arrays.asList(2, 3, 4)));
        arrListWithRepeatedValues.add(new ArrayList<>(Arrays.asList(2, 5, 6)));
        List<Integer> commonElements = ap.getCommonElements(arrListWithRepeatedValues);
        System.out.println(commonElements);

        int diagonalSum = ap.getDiagonalCubeSum(arr);
        System.out.println("The Diagonal Sum Of The Given List is " + diagonalSum);

        List<List<Integer>> pairEvenSum = ap.getEvenSumPair(new int[] {1, 2, 3}, new int[] {2, 3, 4});
        System.out.println("The Even Sum Pairs Are : " + pairEvenSum);

        Employee johnEmp = new Employee("John", new ArrayList<>(Arrays.asList(8, 9, 7, 8)));
        Employee aliceEmp= new Employee("Alice", new ArrayList<>(Arrays.asList(9, 9, 8, 9)));
        Employee bobEmp = new Employee("Bob", new ArrayList<>(Arrays.asList(7, 8, 7, 7)));

        Employee[] empArr = {johnEmp, aliceEmp, bobEmp};
        Employee maxWorkedEmployee = ap.getMaxWorkedEmployee(empArr);
        System.out.println(maxWorkedEmployee.getName() + " worked the most hours: " + maxWorkedEmployee.getTotalWorkedHours() + " hours");
    }

    private Employee getMaxWorkedEmployee(Employee[] empArr)
    {
        int maxHours = 0;

        Employee maxWorkedEmployee = new Employee();

        for (Employee e : empArr)
        {
            if(e.getTotalWorkedHours() > maxHours)
            {
                maxHours = e.getTotalWorkedHours();
                maxWorkedEmployee = e;
            }
        }
        return maxWorkedEmployee;
    }

    private List<List<Integer>> getEvenSumPair(int[] arr1, int[] arr2)
    {
        List<List<Integer>> evenSumPair = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] > -1 && arr2[j] > -1 && (arr1[i] + arr2[j]) % 2 == 0)
                {
                    evenSumPair.add(Arrays.asList(arr1[i],arr2[j]));
                    arr1[i] = -1;
                    arr2[j] = -1;
                }
            }
        }
        return evenSumPair;
    }

    private int getDiagonalCubeSum(int[][] arr)
    {
        int diagonalCubeSum = 0;
        int i = 0, k = 0, j = arr.length - 1;

        while (i < arr.length)
        {
            diagonalCubeSum += Math.pow(arr[i][i], 3);
            i++;
        }

        while((j != k) && (j >= 0) && (k < arr.length - 1))
        {
            diagonalCubeSum += Math.pow(arr[k][j], 3);
            diagonalCubeSum += Math.pow(arr[j][k], 3);
            j--;
            k++;
        }
        return diagonalCubeSum;
    }

    private List<Integer> getCommonElements(List<List<Integer>> arrListWithRepeatedValues)
    {
        List<Integer> list = arrListWithRepeatedValues.get(0);

        for (List<Integer> intList : arrListWithRepeatedValues)
        {
            list.retainAll(intList);
        }
        return list;
    }

    private void printGroupAnagram(String[] strings)
    {
        Map<String, List<String>> anagram = new HashMap<>();

        for (String str : strings)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if (anagram.containsKey(key))
            {
                anagram.get(key).add(str);
            }
            else
            {
                anagram.put(key, new ArrayList<>());
                anagram.get(key).add(str);
            }
        }

        for (Map.Entry<String, List<String>> map : anagram.entrySet())
        {
            System.out.println("Key : " + map.getKey() + " Value : " + map.getValue());
        }

    }

    private List<Integer> convertSpiralToList(int[][] arr)
    {
        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0, right = arr.length - 1, bottom = arr.length - 1;

        while(top <= bottom && left <= right)
        {
            for (int i = left; i <= right; i++)
            {
                list.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++)
            {
                list.add(arr[i][right]);
            }
            right--;
            if(top <= bottom)
            {
                for (int i = right; i >= left; i--)
                {
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
        return list;
    }

    private int[] getIndexOfTargetElement(List<List<Integer>> arrList, int target)
    {
        int[] index = new int[] {-1, -1};

        for (int i = 0; i < arrList.size(); i++)
        {
            for (int j = 0; j < arrList.get(i).size(); j++)
            {
                if(arrList.get(i).get(j) == target)
                {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        return index;
    }

    private Student getHighestGrade(Student[] students)
    {
       Student highestAverageStudent = null;
       double highestAverageGrade = 0;
       for (Student student : students)
       {
           if (student.getAvgGrade() > highestAverageGrade)
           {
               highestAverageGrade = student.getAvgGrade();
               highestAverageStudent = student;
           }
       }
       return highestAverageStudent;
    }

    private int sumOf2DArray(int[][] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
