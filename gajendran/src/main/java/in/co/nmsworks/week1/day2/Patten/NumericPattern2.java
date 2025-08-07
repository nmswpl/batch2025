package in.co.nmsworks.week1.day2.Patten;


//Numeric Pattern 2:
//1 1 1 1 1 1 1
//2 2 2 2 2 2
//3 3 3 3 3
//4 4 4 4
//5 5 5
//6 6
//7


public class NumericPattern2 {

    public static void numericPattern2(int num){
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num-i +1; j ++) {
                System.out.print(i + " ");
            }
        System.out.println(" ");
            }
    }

    public static void main(String[] args) {
        System.out.println("Numeric Pattern 2");
        numericPattern2(7);
    }
}
