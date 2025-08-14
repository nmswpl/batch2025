package in.co.nmsworks.week2.day4;

public class SalesReport extends Report {

        @Override
        public void header() {
            System.out.println("SalesReport Header");
        }

        @Override
        public void body() {
            System.out.println("SalesReport Body");

        }

        @Override
        public void footer() {
            System.out.println("SalesReport Footer");

        }
}
