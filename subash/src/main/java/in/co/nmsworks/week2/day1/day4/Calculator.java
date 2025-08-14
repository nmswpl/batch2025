package in.co.nmsworks.week2.day1.day4;

public class Calculator {

    private Computable compute;

    public Computable getCompute() {
        return compute;
    }

    public void setCompute(Computable compute) {
        this.compute = compute;
    }

    public static void main(String[] args) {

        Computable add=new Adder();
        System.out.println(add.compute(10,10));

        Computable mul=new Multiplier();
        System.out.println(mul.compute(10,10));

        Computable div=new Divider();
        System.out.println(div.compute(70,10));

        System.out.println();

        Calculator calAdd=new Calculator();
        calAdd.performCalculation(6,99,add);

        Calculator calMul=new Calculator();
        calMul.performCalculation(2,2,mul);

        Calculator calDiv=new Calculator();
        calDiv.performCalculation(2,2,div);

    }

    public void performCalculation(int a ,int b,Computable comp)
    {
        System.out.println(comp.compute(a,b));
    }
}
