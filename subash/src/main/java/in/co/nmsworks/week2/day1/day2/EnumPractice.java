package in.co.nmsworks.week2.day1.day2;

public class EnumPractice {

    public enum DAYS{

        SUNDAY("First day"),MONDAY("Second Day"),TUESDAY("Third Day"),WEDNESDAY("Fourth Day"),
        THURSDAY("Fifth Day"),FRIDAY("Sixth Day"),SATURDAY("Seventh Day");

        final String description;

        DAYS(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return this.getDescription();
        }
    }

    public static void main(String[] args)
    {


        printsDayTypeAndDescription(DAYS.SATURDAY);
    }
    public static void printsDayTypeAndDescription(DAYS days)
    {
        switch (days)
        {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            {
                System.out.println("Week Days "+days.getDescription());
                break;
            }
            case SATURDAY:
            case SUNDAY:
                System.out.println("Week Ends "+days.getDescription());
                break;
        }
        System.out.println(days+" "+days.name());
    }

}
