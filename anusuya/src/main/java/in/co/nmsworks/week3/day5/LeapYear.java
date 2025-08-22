package in.co.nmsworks.week3.day5;

public class LeapYear {

    public static void main(String[] args) {

        LeapYear ly = new LeapYear();

        int year = 2025;
        ly.checkAndPrintYearType(year);
    }

    private void checkAndPrintYearType(int year) {

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println(year + " is a Leap year");
        }
        else{
            System.out.println(year + "is not a Leap year");
        }
    }
}
