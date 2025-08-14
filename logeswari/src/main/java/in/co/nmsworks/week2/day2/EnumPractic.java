package in.co.nmsworks.week2.day2;

public class EnumPractic {

    public enum Days {
        SUNDAY("first"),
        MONDAY("second"),
        TUESDAY("third"),
        WEDNESDAY("fourth"),
        THRSDAY("fifth"),
        FRIDAY("sixth"),
        SATURDAY("seventh");

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

    public static void main(String[] args) {
        EnumPractic en1=new EnumPractic();
        Days d1=Days.SUNDAY;
        en1.printDayTypeAndDescription(d1);
    }


    public void printDayTypeAndDescription(Days d1){
        System.out.println(d1+" " +d1.name());
        switch (d1){
            case SUNDAY:

            case SATURDAY:
                System.out.println("weekend" +d1.getDescription());
                break;
            case MONDAY:
            case FRIDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THRSDAY:
                System.out.println("weekdays");
                break;



        }
    }



    }
