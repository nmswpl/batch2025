package in.co.nmsworks.week3.day5;

public class FindGcd {
    public static void main(String[] args) {
        FindGcd findGcd = new FindGcd();
        findGcd.getGcd(45,20);
    }

    private void getGcd(int a, int b) {
        int r;
        while (b > 0){
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
