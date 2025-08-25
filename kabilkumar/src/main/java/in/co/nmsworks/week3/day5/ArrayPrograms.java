package in.co.nmsworks.week3.day5;

import java.util.*;

public class ArrayPrograms {
    public static void main(String[] args)
    {
        ArrayPrograms ap = new ArrayPrograms();
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        ap.addOfMatrix(matrix);

        ap.averageMark();
        ap.listToFindPosition();
        int[][] matrix1 = new int[3][3];
        matrix1[0][0] = 1;
        matrix1[0][1] = 2;
        matrix1[0][2] = 3;
        matrix1[1][0] = 4;
        matrix1[1][1] = 5;
        matrix1[1][2] = 6;
        matrix1[2][0] = 7;
        matrix1[2][1] = 8;
        matrix1[2][2] = 9;
        ap.spiralMatrix(matrix1);

        int[][] matrix2 = new int[3][3];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[1][2] = 6;
        matrix2[2][0] = 7;
        matrix2[2][1] = 8;
        matrix2[2][2] = 9;
        ap.sumOfDaignals(matrix2);

        ap.commonNumbers();



    }
    public  void  commonNumbers()
    {
        List<List<Integer>> common = new ArrayList<>();
        List<Integer> list11 = new ArrayList<>();
        list11.add(1);
        list11.add(2);
        list11.add(3);
        List<Integer> list12 = new ArrayList<>();
        list12.add(2);
        list12.add(5);
        list12.add(3);
        List<Integer> list13 = new ArrayList<>();
        list13.add(2);
        list13.add(8);
        list13.add(9);

       common.add(list11);
       common.add(list12);
       common.add(list13);



    }
    public  void sumOfDaignals(int[][] matrix2)
    {

        for (int i=0 ;i<3 ;i++)
        {
         //  int m1 = matrix2[i][i];
            double pow1 = Math.pow(matrix2[i][i],3);
            double pow2 = Math.pow(matrix2[i][3-1-i],3);


            System.out.println(pow1);
            System.out.println(pow2);
            System.out.println(pow1+pow2);
        }
    }
    public  void spiralMatrix(int[][] matrix1)
    {
        int top = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               // System.out.println(matrix1[i][j]);
                top++;
            }
        }
    }
    public  void listToFindPosition()
    {
        int find = 7;
        List<List<Integer>> listOfList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);
        System.out.println(listOfList);
        for (int i = 0; i < listOfList.size(); i++)
        {
            List<Integer> ls = listOfList.get(i);
            for (int j = 0; j < ls.size(); j++)
            {
                if (find == ls.get(j))
                {
                    System.out.println("Found at ["+i+" , "+j+"]");
                }
        }
        }

    }
    public  void  averageMark ()
    {

        List<Integer[]> mark = new ArrayList<>();
        Integer[] m1 = {85,90,88};
        Integer[] m2 = {90,91,92};
        Integer[] m3 = {70,75,80};
        mark.add(m1);
        mark.add(m2);
        mark.add(m3);

        Map<String,List<Integer[]>> mp = new HashMap<>();
       // mp.put("kk",);

    }
    public  void  addOfMatrix(int matrix[][])
    {
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

}
