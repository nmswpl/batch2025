package in.co.nmsworks.week1.day2;

public class PrintMultiplicationTable {
    // Program to print Tables
    public void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n +" = "+i*n);
        }
    }
    public static void main(String[] args) {
        PrintMultiplicationTable printMultiplicationTable = new PrintMultiplicationTable();
        printMultiplicationTable.printTable(8);
    }
}
