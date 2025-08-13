package in.co.nmsworks.week2.day2.employee;

public class Runner {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.work();

        Manager manager = new Manager();
        manager.work();

        Developer developer = new Developer();
        developer.work();
    }
}
