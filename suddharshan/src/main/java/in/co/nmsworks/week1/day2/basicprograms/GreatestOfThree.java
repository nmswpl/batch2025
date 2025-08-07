package in.co.nmsworks.week1.day2.basicprograms;
/*
Write a program to find greatest of three
 */
public class GreatestOfThree {
    public static void main(String[] args) {
        int d = 5, e = 10, f = 12;
        int g = 13, h = 18, i = 27;
        System.out.println("Greatest No is = " + getGreatest(d,e,f));
        System.out.println("Greatest No is = " + getGreatest(g,h,i));
    }
    public static int getGreatest(int a, int b, int c){
        if (a > b && a >c){
            return a;
        }
        else if (b > a && b  > c) {
            return b;
        }
        else{
            return c;
        }
    }
}

