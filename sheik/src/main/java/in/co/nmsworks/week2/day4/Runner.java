package in.co.nmsworks.week2.day4;

public class Runner
{
    public static void main(String[] args) {

        Employee emp = new Employee("fayas" ,5000.0d);
        //System.out.println("Employee Salary");
        //System.out.println(emp.annualSalary());

        Employee man = new Manager("sheik", 5000.0d,2000);
        //System.out.println(man.annualSalary());



        SalesReport salesrep = new SalesReport();
        //System.out.println(salesrep.generate());

        InventoryReport inventoryReport = new InventoryReport();
        //System.out.println(inventoryReport.generate());


       /* Movie m1 = new Movie("Enthiran" , 2010 );
        Movie m2 = new Movie("Kabali" , 2016);
        Movie m3 = new Movie("Superstar",2002);
        Movie m4 = new Movie("Baasha",1995);
        Movie m5 = new Movie("Muthu",1995);
        Movie m6 = new Movie("Sivaji",2007);
        Movie m7 = new Movie("petta",2019);
        Movie m8 = new Movie("Thalapathi",1991);
        Movie m9 = new Movie("Shivaji",2007);
        Movie m10 = new Movie("Kaala",2018);

        Movie[] movies = new Movie[] {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};

        System.out.println(movies.length);
        System.out.println(movies[0].name);
        System.out.println(movies[movies.length-1].name);

        /*for(int i=0;i< movies.length;i++) {
            if (movies.)
            //printDetail(movies);
        }

         */

    }

    //public static void printSalary(Employee emp2){
        //System.out.println(emp2.annualSalary());
    //}
}
