package in.co.nmsworks.week1.day2;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int f=fact(n);
        System.out.println("Factorial for"+n+" "+f);
    }
    public static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
