package in.co.nmsworks.week2.day2;

import javax.management.MBeanAttributeInfo;
import java.net.FileNameMap;

public class EnumPractice {
    public enum Days{
        SUNDAY("1st day"),MONDAY("2nd day"),TUESDAY("3rd day"),WEDNESDAY("4th day"),THURSDAY("5th day"),FRIDAY("6th day"),SATURDAY("7th day");

        final String description;

        Days(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }


        @Override
        public String toString() {
            return this.description;
        }
    }

    public static void main(String[] args) {
        Days day = Days.SUNDAY;
        printDataTypeAndDescription(day);

    }

    public static void printDataTypeAndDescription(Days day) {
        System.out.println(day + " " +day.name());
        switch(day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("This is weekdays" + day.getDescription());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("This is weekend " + day.getDescription());
                break;
        }
    }
}
