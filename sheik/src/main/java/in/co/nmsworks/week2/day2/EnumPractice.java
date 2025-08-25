package in.co.nmsworks.week2.day2;

public class EnumPractice
{
    public enum Days{
        SUNDAY("first day"),MONDAY("second day"),TUESDAY("third day"),WEDNESDAY("fourth day"),THURSDAY("fifth day"),FRIDAY("sixth day"),SATURDAY("seventh day");
        final String description;

        @Override
        public String toString() {
            return this.description;
        }

        Days(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public static void main(String[] args) {
            printDayTypeAndDescription(Days.SATURDAY);
        }

        public static void printDayTypeAndDescription(Days day){

            System.out.println(day.name());

            switch(day){

                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Week Day " + day.getDescription());
                    break;
                case SUNDAY :
                case SATURDAY:
                    System.out.println("Week End " + day.getDescription());
                    break;
            }
        }
    }
}
