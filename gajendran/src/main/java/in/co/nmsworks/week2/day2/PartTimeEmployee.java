package in.co.nmsworks.week2.day2;

public class PartTimeEmployee extends Employee{

    private long numberOfHourWorked;
    private long numberOfDaysWorked;

    public PartTimeEmployee(){

        setBasePayInLakh(5);

    }

    @Override
    public long getNumberOfHourWorked() {
        return numberOfHourWorked;
    }

    public long getNumberOfDaysWorked() {
        return numberOfDaysWorked;
    }

    public void setNumberOfDaysWorked(long numberOfDaysWorked) {
        this.numberOfDaysWorked = numberOfDaysWorked;
    }

    @Override
    public void setNumberOfHourWorked(long numberOfHourWorked) {
        this.numberOfHourWorked = numberOfHourWorked + (numberOfDaysWorked * 8);
        super.setNumberOfHourWorked(this.getNumberOfHourWorked());
    }

}
