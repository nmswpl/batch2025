package in.co.nmsworks.week1.day2;

public class Largest {
    public static void largestAmongThree(int a,int b,int c){
        if(a>=b && a>=c){
            System.out.println(a + " is greatest among the three");
        }
        else if(b>=a && b>=c){
            System.out.println(b + " is greatest among the three");
        }
        else{
            System.out.println(c + " is greatest among the three");
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 7, c = 20;
        largestAmongThree(a,b,c);
    }
}
