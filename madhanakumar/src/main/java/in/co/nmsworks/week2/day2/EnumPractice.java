package in.co.nmsworks.week2.day2;

public class EnumPractice {
    public enum DaysOfWeek {
        SUNDAY("First Day"),
        MONDAY("Second Day"),
        TUESDAY("Third Day"),
        WEDNESDAY("Fourth Day"),
        THURSDAY("Fifth Day"),
        FRIDAY("Sixth Day"),
        SATURDAY("Seventh Day");

        final String description;

        public String getDescription() {
            return description;
        }

        DaysOfWeek(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return this.description;
        }
    }

    public static void main(String[] args) {
        printDayTypeAndDescription(DaysOfWeek.MONDAY);
    }

    public static void printDayTypeAndDescription(DaysOfWeek day){

        System.out.println(day +" "+day.name());
        switch (day){
            case SUNDAY:
            case SATURDAY:
                System.out.println("weekend "+day.getDescription());
                break;
            case MONDAY:
            case THURSDAY:
            case TUESDAY:
            case FRIDAY:
            case WEDNESDAY:
                System.out.println("WeekDay "+day.getDescription());
                break;
        }
    }
}
