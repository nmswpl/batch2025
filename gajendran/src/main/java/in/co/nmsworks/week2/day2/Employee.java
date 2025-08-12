package in.co.nmsworks.week2.day2;

public class Employee {

    private long basePayInLakh;
    private long numberOfHourWorked = 0;
    private long salaryInLakh = 0;

    public long getBasePayInLakh() {
        return basePayInLakh;
    }

    public long getNumberOfHourWorked() {
        return numberOfHourWorked;
    }

    public void setNumberOfHourWorked(long numberOfHourWorked) {
        this.numberOfHourWorked = numberOfHourWorked;
    }

    public void setBasePayInLakh(long basePayInLakh) {
        this.basePayInLakh = basePayInLakh;
    }

    public long generateSalary(){
        if (numberOfHourWorked <= 0){
            return 0;
        }
        salaryInLakh = numberOfHourWorked * basePayInLakh;
        return salaryInLakh;
    }
}
