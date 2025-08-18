package in.co.nmsworks.week2.day2;

import java.sql.SQLOutput;

public class EnumPractise {

    public enum DaysOfWeek {
        SUNDAY ("First day"),
        MONDAY ("Second day"),
        TUESDAY("Third day"),
        WEDNESDAY ("Fourth day"),
        THURSDAY ("Fifth day"),
        FRIDAY("Sixth day"),
        SATURDAY ("Seventh day");

        final String  desc;

        DaysOfWeek(String desc) {
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }

        @Override
        public String toString() {
            return this.desc;
        }
    }

    public static void printDayTypeAndDescription(DaysOfWeek day) {
        System.out.println(day+ " " + day.name());
        switch(day) {
            case SUNDAY:
            case SATURDAY: {
                System.out.println("Week end");
                System.out.println(day.desc);
                break;
            }

            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY: {
                System.out.println("Week days");
                System.out.println(day.getDesc());
                break;
            }
        }
    }

    public static void main(String[] args) {
        printDayTypeAndDescription(DaysOfWeek.SATURDAY);
    }
}
