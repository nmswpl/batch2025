package in.co.nmsworks.week2.day3;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Employee {
    public static void work() {
        System.out.println("In Employee class");
    }
}

class Manager extends Employee {
    public static void work() {
        System.out.println("In Manager class");
    }
}

class Developer extends Employee {
    public static void work() {
        System.out.println("In Developer class");
    }
}

class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
    }
}
