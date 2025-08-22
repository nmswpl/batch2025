package in.co.nmsworks.week3.day5;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.calculateYear(2000);
    }

    private void calculateYear(int year) {
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Given Year "+year+" is a leap year");
        } else if (year % 400 == 0){
            System.out.println("Given Year "+year+" is a leap year");
        } else {
            System.out.println("Given Year "+year+" is not a leap year");
        }
    }
}
