package in.co.nmsworks.week1.test;

public class HundredPositionWord {
    public static void main(String[] args) {

        int n = 542;
        findTheword(n);
    }

    public static void findTheword(int n) {

        String[] str = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int temp = n/100;
        System.out.println(str[temp - 1]);
    }


}
