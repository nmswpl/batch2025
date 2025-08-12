package in.co.nmsworks.week2.day1.day2;

public class EnumPractise
{
   public enum days {
       sunday("firstday"), monday("secondday"), tuesday("thirdday"), wednesday("fourthday"), thursday("fivethday"), friday("sixthday"), saturday("seventhday");

       final String description;

       @Override
       public String toString() {
           return this.description;
       }

       public String getDescription() {
           return description;
   }


       days(String description)
       {
           this.description = description;
       }
   }

    public static void main(String[] args)
    {
        days day =days.sunday;
        System.out.println(days.monday);
        System.out.println(days.sunday);
    }
    public static void printDayTypeAndDescription(days day)
    {
        System.out.println(day + " " + day.name());
        switch (day)
        {
            case monday :
            case tuesday:
            case friday:
            case thursday:
            case wednesday:
                System.out.println("week day");
                break;
            case sunday:
                System.out.println("week start");
                break;
            case saturday:
                System.out.println("week end" + day.getDescription());

        }
    }
}
