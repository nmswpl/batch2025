package in.co.nmsworks.week2.day2;

public class Contractor extends Employee {
    public Contractor() {
    }

    public Contractor(int id, String name, String email, String dept, Salary salary) {
        super.setId(id);
        super.setName(name);
        super.setEmail(email);
        super.setDept(dept);
        super.setSalary(salary);
    }

}
