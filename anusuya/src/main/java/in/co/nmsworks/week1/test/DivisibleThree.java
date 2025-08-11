package in.co.nmsworks.week1.test;

public class DivisibleThree {

    public static void printValuesDivisibleByThree(){

        for(int i = 300; i < 400; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        printValuesDivisibleByThree();
    }
}
