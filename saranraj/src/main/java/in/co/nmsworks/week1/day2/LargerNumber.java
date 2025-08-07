package in.co.nmsworks.week1.day2;

//find the large number among three number

public class LargerNumber {
    public static void main(String[] args) {
        findLarge(4,4,13);

    }
    public static void findLarge(int a,int b,int c){
        if( a > b && a > c ){
            System.out.println("A is Greater and Value : " + a);
        }else if( b > a && b > c ){
            System.out.println("B is Greater and Value : " + b);
        }else{
            System.out.println("C is Greater and Value : " + c);
        }
    }

}

