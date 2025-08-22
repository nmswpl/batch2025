package in.co.nmsworks.week3.day5;

public class GreatestCommonDiviser {
    public static void printCommonDiviser(){
        int num=20;
        int a=20;
        int b=2;
        int r=a%b;

        for(int i=2;i<num/2;i++){
            if( num % i==0){
                System.out.println("Greatest common diviser "+ i);
            }
        }
        r=a;
        a=b;
        b=r;
//        System.out.println("b = "+ b);
//        System.out.println("b = "+ r);

    }
    public static void main(String[] args) {
        printCommonDiviser();

    }


}
