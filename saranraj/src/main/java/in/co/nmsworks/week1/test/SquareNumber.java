package in.co.nmsworks.week1.test;

public class SquareNumber {

    public static void main(String[] args) {

        int[] number = new int[] {2,4,3,5};
        printSquareNumber(number);
    }

    private static void printSquareNumber(int[] number) {
        for(int num : number){
            System.out.print(num * num + " ");
        }
    }
}
