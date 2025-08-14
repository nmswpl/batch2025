package in.co.nmsworks.week2.day4;

public class Calculator {


    public void performCalculation(int a, int b, Computable operation){
        System.out.println();
        System.out.println(operation.getClass().getSimpleName());
        int temp = operation.compute(a,b);
        if (operation instanceof Divider){
            if (temp == 0){
                return;
            }
        }

        System.out.println(" a = "+a+"\tb = "+b+"\tAnswer = "+temp);
        System.out.println();
    }


}
