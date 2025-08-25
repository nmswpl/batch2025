package in.co.nmsworks.week3.day5;

import java.util.*;

public class SysInPractice
{


    private void sumOfMatrix()
    {
        Scanner scanner = new Scanner(System.in);

        int row = 0, col = 0;


        System.out.print("Enter number of row : ");
        row = scanner.nextInt();
        System.out.print("Enter number of col : ");
        col = scanner.nextInt();


        int[][] array = new int[row][col];

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                array[i][j] = scanner.nextInt();
            }
        }


        long sumOfMatrix =  0;

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                sumOfMatrix += array[i][j];
            }
        }


        System.out.println("Sum of the Matrix Array : "+sumOfMatrix);

    }




    private void gradebook()
    {
        Scanner scanner = new Scanner(System.in);



        Map<String, Integer[]> students = new HashMap<>();

        System.out.print("Enter the number of the student : ");
        int countOfStudent = scanner.nextInt();
          scanner.nextLine();
        for (int i = 0; i < countOfStudent; i++)
        {
            Integer[] grades = new Integer[3];

            System.out.println("Enter the Student name and grade for 3 subject : ");

            String name = scanner.nextLine();
            System.out.println("enter grades");
            grades[0] = scanner.nextInt();
            grades[1] = scanner.nextInt();
            grades[2] = scanner.nextInt();

            students.put(name,grades);
        }

        float highAvg = 0;
        String highAvgName = "";
        for (String s : students.keySet())
        {
            Integer[] temp = students.get(s);
            float avg = 0;
            //- John: Average = 87.67
            for (Integer i : temp)
            {
                avg += i;
            }
            avg /= 3;

            System.out.println("- "+s+" : Average = " +avg);

            if (avg > highAvg)
            {
                highAvgName = s;
                highAvg = avg;
            }
        }

        System.out.println("- Highest Average "+highAvgName+" (" +highAvg+")");

    }


    public static void main(String[] args)
    {


        SysInPractice sysInPractice = new SysInPractice();
        sysInPractice.sumOfMatrix();

        sysInPractice.gradebook();

        List<List<Integer>> matrix = new ArrayList<>();

        Integer j = 1;
        for (int i = 0;i < 3; i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(j++);
            temp.add(j++);
            temp.add(j++);
            matrix.add(temp);
        }
        System.out.println(matrix);
        if(sysInPractice.findTargetInMatrix(matrix,3) != -1){
            System.out.println();
        }
        else {
            System.out.println(("Not found"));
        }

        int[][] array = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> resultForSpiralArray =  sysInPractice.spiralOrder(array);
        System.out.println(resultForSpiralArray);

       /* String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
       sysInPractice.groupingStringsByAnagram(anagrams);*/
    }

    private void groupingStringsByAnagram(String[] anagrams)
    {
        //Map<String, >



    }

    private List<Integer> spiralOrder(int[][] array)
    {
        List<Integer> resultForSpiralArray = new ArrayList<>();

        int limitIncrementOfI = array[0].length - 1;
        int limitIncrementOfJ = array.length - 1;

        int limitDecrementOfI = 0;
        int limitDecrementOfJ = 0;

        int i = 0, j = 0;
        int dir = 0;
        System.out.print(limitDecrementOfI+" ");
        System.out.println(limitIncrementOfI);
        System.out.print(limitDecrementOfJ+" ");
        System.out.println(limitIncrementOfJ);
        System.out.println(i);
        System.out.println(j);
        int kkk = 0;
        while(!(limitDecrementOfJ == limitIncrementOfJ) && !(limitDecrementOfI == limitIncrementOfI) &&  !(limitDecrementOfI == limitIncrementOfJ))
        {

            switch (dir)
            {
                case 0:
                    System.out.print(limitDecrementOfI+" ");
                    System.out.println(limitIncrementOfI);
                    System.out.print(limitDecrementOfJ+" ");
                    System.out.println(limitIncrementOfJ);
                    System.out.println(i);
                    System.out.println(j);
                    if (i >= limitIncrementOfI)
                    {
                        dir = 1;
                        j++;
                        limitIncrementOfI--;
                        break;
                    }
                    resultForSpiralArray.add(array[j][i]);
                    i++;
                    break;
                case 1:
                    if (j >= limitIncrementOfJ)
                    {
                        dir = 2;
                        i--;
                        limitIncrementOfJ--;
                        break;
                    }
                    resultForSpiralArray.add(array[j][i]);
                    j++;
                    break;
                case 2:
                    if (j <= limitDecrementOfJ)
                    {
                        dir = 3;
                        i++;
                        limitDecrementOfJ--;
                        break;
                    }
                    resultForSpiralArray.add(array[j][i]);
                    i--;
                    break;
                case 3:

                    if (i <= limitDecrementOfI)
                    {
                        dir = 0;
                        j--;
                        limitDecrementOfI--;
                        break;
                    }
                    resultForSpiralArray.add(array[j][i]);
                    i++;
                    break;
            }
        }

        return resultForSpiralArray;
    }

    private int findTargetInMatrix(List<List<Integer>> matrix, Integer target)
    {
        int row = 0;
        for (List<Integer> integers : matrix)
        {
            int col = 0;
            for (Integer integer : integers)
            {
                if (integer.equals(target)){
                    System.out.println("Found at ("+row+" , "+col+")");
                    return 1;
                }
                col++;
            }
            row++;
        }
        return -1;
    }


}
