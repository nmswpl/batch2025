package in.co.nmsworks.week2.day4;

public class Divider implements Computable{
    char ch='/';


    @Override
    public int compute(int a, int b) {
        if(a>0){
            System.out.println("divided : "+a/b);
        }
        else {
            System.out.println("An  error message or handle gracefully : "+compute(a,b));
        }
        return (a/b);
    }
}
