package in.co.nmsworks.week1.test;

public class SquareOfTheValue {
    static void squareCalculation(int [] value){
        for(int i=0;i<value.length;i++){
            System.out.println(value[i]*value[i]);
        }
    }
    public static void main(String[] args) {
        int [] inputArray={2,3,4,5};
        squareCalculation(inputArray);

    }
}
