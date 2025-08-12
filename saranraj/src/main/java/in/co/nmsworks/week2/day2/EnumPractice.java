package in.co.nmsworks.week2.day2;

public class EnumPractice {
    public enum Days{
        SUNDAY("1st Day"),
        MONDAY("2nd Day"),
        TUESDAY("3rd Day"),
        WEDNESDAY("4th Day"),
        THURSDAY("5th Day"),
        FRIDAY("6th Day"),
        SATURDAY("7th Day");
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

    static void printDayTypeAndDescription(Days day){

        System.out.println(day+" "+day.name());


        switch (day){
            case SUNDAY :
            case SATURDAY :
                System.out.println("Weekend " + day.description + day.name());
                break;
            default:
                System.out.println("Week Day "+day.description);
                break;
        }

    }

    public static void main(String[] args) {
        Days day=Days.SATURDAY;
        printDayTypeAndDescription(day);
    }

}
