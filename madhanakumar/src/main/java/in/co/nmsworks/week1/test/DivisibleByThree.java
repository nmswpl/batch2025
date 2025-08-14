package in.co.nmsworks.week1.test;

public class DivisibleByThree {
    public void findDivisbleValues(){
        for (int i = 301; i < 400; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        DivisibleByThree db = new DivisibleByThree();
        db.findDivisbleValues();
    }
}
