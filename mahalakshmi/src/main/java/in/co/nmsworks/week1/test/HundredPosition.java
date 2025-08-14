// 2. Given a number, write a program to print the hundred position value in words.

package in.co.nmsworks.week1.test;
public class HundredPosition {
    public static void main(String[] args) {
        int number = 542;
        System.out.println(printHundredPosition(number));
    }

    public static String printHundredPosition(int num) {
        int digit = 0;
        int iteration = 0;
        while(num > 0) {
            digit = num % 10;
            num /= 10;
            iteration++;
            if (iteration == 3) {
                break;
            }
        }
        switch(digit) {
            case 1:
            {
                return "One";
            }
            case 2:
            {
                return "Two";
            }
            case 3:
            {
                return "Three";
            }
            case 4:
            {
                return "Four";
            }
            case 5:
            {
                return "Five";
            }
            case 6:
            {
                return "Six";
            }
            case 7:
            {
                return "Seven";
            }
            case 8:
            {
                return "Eight";
            }
            case 9:
            {
                return "Nine";
            }
        }
        return "Zero";
    }
}
