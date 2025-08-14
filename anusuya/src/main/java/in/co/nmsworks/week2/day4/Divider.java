package in.co.nmsworks.week2.day4;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if(b==0){
            System.out.print("Cant divided by ");
            return 0;
        }
        else if(a < b){
            System.out.print("Here Denominator " + b + " is greater than " + a + " It will always return ");
            return 0;
        }
        else{
            System.out.print("Division of " + a + " and " + b + " = ");
            return (a/b);
        }
    }
}
