package in.co.nmsworks.week2.day4;

public class Calculator implements Computable {

    


    @Override
    public int compute(int a, int b) {
        return 0;
    }



    public static void main(String[] args) {
        Calculator calculate = new Calculator();
        Adder add = new Adder();
        Multiplier mul = new Multiplier();
        Divider div = new Divider();
        calculate.performCalculation(10,20,add);
        calculate.performCalculation(20,30,mul);
        calculate.performCalculation(10,5,div);

    }



    public  void performCalculation(int a , int b ,Computable operation){
        System.out.println(operation.compute(a,b));

    }
}
