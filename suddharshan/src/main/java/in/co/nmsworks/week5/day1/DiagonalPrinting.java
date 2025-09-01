package in.co.nmsworks.week5.day1;

import java.util.Scanner;

public class DiagonalPrinting {
    public static void main(String[] args) {
        DiagonalPrinting dp = new DiagonalPrinting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        dp.getDiagonalPrinting(num);
    }
    public void getDiagonalPrinting(int num){
        char [][] mat = new char[num][num];
        int val = 97;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(i==j){
                    mat[i][j] = (char) val;
                    val++;
                }
                else{
                    mat[i][j] = ' ';
                }
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
