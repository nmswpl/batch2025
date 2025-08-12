package in.co.nmsworks.week2.day2;

public class EnumPratice {

    public enum DaysOfWeek{
        SUN ("Day1"),MON("Day2"), TUE("Day3"), WED("Day4"), THU("Day5"), FRI("Day6"), SAT("Day7");

        final String disc;

        DaysOfWeek(String disc) {
            this.disc = disc;
        }


        public String getDisc() {
            return disc;
        }

        @Override
        public String toString() {
            return "DaysOfWeek{" +
                    "Day='" + disc + '\'' +
                    '}';
        }
    }


    public static void printDayTypeAndDisc(DaysOfWeek day){

        System.out.println("Day : "+ day);
        System.out.println("Type : "+day.disc);



        switch (day){
            case day.SAT:
            case day.SUN:
                System.out.println("Week End");
            default:
                System.out.println("Week Day :" + day.getDisc());
        }


    }

    public static void main(String[] args) {

        DaysOfWeek day1 = DaysOfWeek.MON;
        printDayTypeAndDisc(day1);


    }

}
