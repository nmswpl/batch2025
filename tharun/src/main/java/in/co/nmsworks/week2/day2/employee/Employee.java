package in.co.nmsworks.week2.day2.employee;

class Employee {
    void work(){
        System.out.println("Employee class work Method");
    }
}

class Manager extends Employee{
    @Override
    void work() {
        System.out.println("Manager class work method");
    }
}

class Developer extends Employee{
    @Override
    void work() {
        System.out.println("Developer class work method");
    }
}
