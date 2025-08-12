package in.co.nmsworks.week2.day2;

public class EnumPractice {
    public enum Days {
        MONDAY("First Day"),
        TUESDAY("Second Day"),
        WEDNESDAY("Third Day"),
        THURSDAY("Fourth Day"),
        FRIDAY("Five Day"),
        SATURDAY("Sixth Day"),
        SUNDAY("Seventh Day");

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

    }

        private void printDayTypeAndDescription(Days day){
            System.out.println(day+ " " +day.name());
            switch(day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY:
                    System.out.println("Week day " + day.name());
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekend " + day.name());
                    break;
            }
    }

        public static void main(String[] args) {
            EnumPractice obj = new EnumPractice();
            obj.printDayTypeAndDescription(Days.SUNDAY);



        }
    }

