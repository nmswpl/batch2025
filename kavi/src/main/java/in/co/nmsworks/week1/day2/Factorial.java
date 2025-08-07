package in.co.nmsworks.week1.day2;
//4.Factorial Program in Java
public class Factorial {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("the facorial of 5 is"+fact(5));


    }
}
