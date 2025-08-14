package in.co.nmsworks.week1.test;

public class DivisibleByThree {
    public static void main(String[] args) {
        for(int i = 300; i <= 500; i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
