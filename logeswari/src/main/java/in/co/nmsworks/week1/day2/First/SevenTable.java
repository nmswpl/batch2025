package in.co.nmsworks.week1.day2.First;

//Multiples of 7 Program in Java
//7 x 1 =7
//        7 x 2 = 14
//        7 x 3 = 21
//        …
//        ...
//        7 x 10 = 70

public class SevenTable {
    static int n=7;
    static void call()
    {
        for(int i=1;i<=10;i++){
            System.out.println(n +" x "+i +" = "+ (i*n));

        }

    }

    public static void main(String[] args) {
       call();
    }
}
