package in.co.nmsworks.week2.day2;

public class EmployeeExample {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void work(){
        System.out.println("Work Role ");
    }

    public static void main(String[] args) {

        Developer saran = new Developer();

        saran.work();
        Manager qwerty = new Manager();
        qwerty.work();
    }


}

class Developer extends EmployeeExample {





    @Override
    public void work() {
        System.out.println("Work role : Developer");
    }
}

class Manager extends EmployeeExample {





    @Override
    public void work() {
        System.out.println("Work role : Manager");
    }
}

