package in.co.nmsworks.week2.day2;

public class EmunPractice {

    public enum DaysOfweek {
        SUN ("One"),MON ("Two"), TUE ("Three"), WED ("Four"), THRU ("Five"), FRI ("Six"), SAT ("Seven");
        final String descp;

        public String getDescp() {
            return descp;
        }

        @Override
        public String toString() {
            return descp;
        }

        DaysOfweek(String descp) {
            this.descp = descp;
        }
    }


    public static void main(String args[]) {
        printDayTypeAndDescp(DaysOfweek.SAT);
    }

    public static void printDayTypeAndDescp(DaysOfweek day) {
        System.out.println(day + " " + day.name());
        if(day == DaysOfweek.SUN || day == DaysOfweek.SAT) {
            System.out.println("Week End" + " " + day.getDescp() + " " +  day);
        }
        else {
            System.out.println("WeeK Day" + " " + day.getDescp() + " " + day);
        }
    }

}