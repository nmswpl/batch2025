package in.co.nmsworks.week2.day2;

public class EnumPractice {
    public enum Days{
        SUNDAY("First Day"),MONDAY("Second day"),TUESDAY("Third day"),WEDNESDAY("Fourth day"),THURSDAY("Fifth day"),FRIDAY("Sixth day"),SATURDAY("Seventh day");
        final String description;
        public String getDescription(){

            return description;
        }

        Days(String description){
            this.description=description;
        }
        @Override
        public String toString() {
            return this.description;
        }
    }

    public static void main(String[] args) {
        printDayTypeAndDescription(Days.SUNDAY);
    }

    public static void printDayTypeAndDescription(Days day){
        System.out.println(day.getDescription()+" "+day.name());

        switch (day){
            case SUNDAY :
            case SATURDAY:
                System.out.println("Week end "+day.getDescription());
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Week day"+day.getDescription());
        }
    }

}
