package in.co.nmsworks.week2.day2;

import com.sun.jdi.PathSearchingVirtualMachine;

public class EnumPractice {
    public enum Days
    {
        SUNDAY("FIRSTDAY"),
        MONDAY("SECONDDAY"),
        TUESDAY("THIRDDAY"),
        WEDNESDAY("FOURTHDAY"),
        THURSDAY("FIFTHDAY"),
        FRIDAY("SIXTHDAY"),
        SATURDAY("SEVENTHDAY");
        final String description;

        Days(String description)
        {
            this.description = description;
        }

        public String getDescription()
        {
            return description;
        }

        @Override
        public String toString() {
            return this.getDescription();
        }
    }

    public static void main(String[] args) {
        printDayTypeAndDescription(Days.SATURDAY);
    }

    public static void printDayTypeAndDescription(Days day) {
       switch (day)
       {
           case SUNDAY :
           case SATURDAY:
           {
               System.out.println("weekend "+day.getDescription());
               break;
           }
           case MONDAY:
           case TUESDAY:
           case WEDNESDAY:
           case THURSDAY:
           case FRIDAY:
           {
               System.out.println("weekday "+day.getDescription());
               break;
           }
       }
        System.out.println(day+" "+day.name());
    }
}
