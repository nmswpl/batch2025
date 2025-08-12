package in.co.nmsworks.week2.day2;

public class EnumPractice
{
    public enum Days
    {
        SUNDAY("First Day"), MONDAY("Second Day"), TUESDAY("Third Day"),
        WEDNESDAY("Fourth Day"), THURSDAY("Fifth Day"), FRIDAY("Sixth Day"),
        SATURDAY("Seventh Day");

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
            return "Days{" +
                    "description='" + description + '\'' +
                    '}';
        }
    }

    public static void main(String[] args)
    {
        EnumPractice enumPractice = new EnumPractice();
        Days day = Days.SATURDAY;
        enumPractice.printDayType(day);

    }

    public void printDayType(Days day)
    {
        System.out.println(day + " " + day.name());

        switch (day)
        {
            case SUNDAY:
            case SATURDAY:
                System.out.println("Weekend " + day.getDescription());
                break;

            default:
                System.out.println("Weekday " + day.getDescription());
        }

    }
}
