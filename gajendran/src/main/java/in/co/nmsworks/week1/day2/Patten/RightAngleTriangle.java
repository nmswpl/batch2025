package in.co.nmsworks.week1.day2.Patten;


//Numeric Pattern 1 :
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7



public class RightAngleTriangle {

    public static void rightAngleTriangle(int num){

        for (int i = 1; i <= num; i++ ){
            for (int j = 1; j <= i; j ++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Right Angle Triangle");
        rightAngleTriangle(7);
    }

}
