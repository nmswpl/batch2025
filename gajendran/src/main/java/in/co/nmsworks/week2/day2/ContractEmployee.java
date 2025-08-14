package in.co.nmsworks.week2.day2;

public class ContractEmployee extends Employee{

    private long numberOfHourWorked;

    public ContractEmployee(){
        setBasePayInLakh(3);
    }

    @Override
    public void setNumberOfHourWorked(long numberOfHourWorked) {
        this.numberOfHourWorked = numberOfHourWorked;
        super.setNumberOfHourWorked(this.numberOfHourWorked);
    }
}
