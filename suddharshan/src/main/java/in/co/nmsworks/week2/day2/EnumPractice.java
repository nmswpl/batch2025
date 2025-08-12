package in.co.nmsworks.week2.day2;

public class EnumPractice {
    public enum Days{
        SUNDAY("First Day"), MONDAY("Second Day"), TUESDAY("Third Day"), WEDNESDAY("Fourth Day"), THURSDAY("Fifth Day"), FRIDAY("Sixth Day"), SATURDAY("Seventh Day");
        final String Description;
        Days(String description) {
            Description = description;
        }
        public String getDescription() {
            return Description;
        }

        @Override
        public String toString() {
            return Description;
        }
    }
    public static void printDayTypeAndDescription(Days day){
        switch (day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:{
                System.out.println("Weekday and it is " + day.getDescription());
                break;
            }
            case SATURDAY:
            case SUNDAY:{
                System.out.println("Weekend and it is " + day.getDescription());
                break;
            }
        }
    }
    public static void main(String[] args) {
        printDayTypeAndDescription(Days.SATURDAY);
        Days day = Days.SUNDAY;
        System.out.println("day: " + day.name());
        System.out.println(day);
    }
}
