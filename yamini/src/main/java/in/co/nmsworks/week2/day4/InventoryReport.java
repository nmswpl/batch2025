package in.co.nmsworks.week2.day4;

public class InventoryReport extends Report{


        @Override
        public void header() {
            System.out.println("InventoryReport Header");
        }

        @Override
        public void body() {
            System.out.println("Inventory Body");

        }

        @Override
        public void footer() {
            System.out.println("InventoryReport Footer");

        }
    }
