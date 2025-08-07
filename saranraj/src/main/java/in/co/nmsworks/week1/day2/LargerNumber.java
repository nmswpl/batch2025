package in.co.nmsworks.week1.day2;

public class LargerNumber {
    public static void main(String[] args) {
        findLarge(4,4,13);

    }
    public static void findLarge(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("A is Greater "+a);
        }else if(b>a && b>c){
            System.out.println("B is Greater "+b);
        }else{
            System.out.println("C is Greater "+c);
        }
    }

}

