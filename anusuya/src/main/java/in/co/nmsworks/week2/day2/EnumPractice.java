package in.co.nmsworks.week2.day2;

public class EnumPractice {

    public enum Days{
        SUNDAY("First day"),
        MONDAY("Second day"),
        TUESDAY("Third day"),
        WEDNESDAY("Fourth day"),
        THURSDAY("Fifth day"),
        FRIDAY("Sixth day"),
        SATURDAY("Seventh day");

        final String DESCRIPTION;

        Days(String s) {
            this.DESCRIPTION = s;
        }

        public String getDESCRIPTION() {
            return DESCRIPTION;
        }

        @Override
        public String toString() {
            return this.getDESCRIPTION();
        }
    }

    public static void main(String[] args) {

        EnumPractice e1 = new EnumPractice();
        Days day = Days.SATURDAY;
        e1.printDayTypeAndDescription(day);
    }

    public void printDayTypeAndDescription(Days day){
        System.out.println(day + " " + day.name());
        switch(day){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("WEEK DAY " + day.getDESCRIPTION());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("WEEK END " + day.getDESCRIPTION());
                break;
        }
    }
}
