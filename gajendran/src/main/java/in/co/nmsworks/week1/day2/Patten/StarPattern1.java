package in.co.nmsworks.week1.day2.Patten;


//Star Pattern 1 :
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
//* * * * * * *




public class StarPattern1 {

    public static void starPattern1(int num){
        for (int i = 1; i <= num; i ++){
            for (int j = 1; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        starPattern1(7);
    }
}
