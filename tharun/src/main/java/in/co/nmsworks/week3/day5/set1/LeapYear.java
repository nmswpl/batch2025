package in.co.nmsworks.week3.day5.set1;

/**
 * Problem-2: Write a program to check if a given year is a leap year.
 *         A year is considered a leap year if it meets one of the following conditions:
 * Condition 1:
 * Divisible by 4: A year must be divisible by 4 to be a leap year.
 * Not Divisible by 100: However, if the year is also divisible by 100, it is not a leap year
 * Condition 2:
 * Divisible by 400: The year is divisible by 400.
 */

public class LeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        int year = 2000;
        if(leapYear.checkLeapYearOrNot(year)){
            System.out.println(year + " is Leap Year ");
        }
        else {
            System.out.println(year + " is not Leap Year");
        }
    }

    private Boolean checkLeapYearOrNot(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0 ) {
            isLeapYear = true;
            if (year % 100 != 0){
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
                else {
                    isLeapYear = false;
                }
            }

        }
        return isLeapYear;
    }

}
