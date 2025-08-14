package in.co.nmsworks.week2.day2;

public class EnumPractice {

    public enum Days {
        SUNDAY("1st day"), MONDAY("2nd day"), TUESDAY("3rd day"), WEDNESDAY("4th day"), THURSDAY("5th day "), FRIDAY("6th day"), SATURDAY("7th day");
        final String DESCRIPTION;

        Days(String DESCRIPTION){

            this.DESCRIPTION = DESCRIPTION ;
        }
        public String getDESCRIPTION() {
            return DESCRIPTION;
        }

        @Override
        public String toString() {
            return DESCRIPTION;
        }

    }

    public static void main(String[] args) {
        Days day = Days.SATURDAY;
        printDayTypeAndDescription(day);

    }

    private static void printDayTypeAndDescription(Days day) {
        System.out.println(day + " " + day.name());
        switch (day){
            case SATURDAY:
            case SUNDAY:
                System.out.println("weekend" + " " +day.getDESCRIPTION());
                break;
            default :
                System.out.println("weekday" + " "+day.getDESCRIPTION());
        }

    }

}
