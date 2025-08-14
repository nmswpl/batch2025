package in.co.nmsworks.week2.day4;

public class Add implements Computable{
    char ch='+';
    @Override
    public int compute(int a, int b) {
        if(a>0){
            System.out.println("Adder: "+(a+b));
        }
        return (a+b);
    }
}
