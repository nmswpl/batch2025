package in.co.nmsworks.week2.day2;

public class Bike extends Vehicle{

    public enum HandlebarType{
        RAISED,LOWER;
    }

    HandlebarType handlebarType;
    public Bike(String model , int yearMake ,HandlebarType handlebar) {
        super.setModel(model);
        super.setYearMake(yearMake);
        this.handlebarType=handlebar;
    }

    public HandlebarType getHandlebarType() {
        return handlebarType;
    }

    public void setHandlebarType(HandlebarType handlebarType) {
        this.handlebarType = handlebarType;
    }

    @Override
    void display() {
        super.display();
        System.out.println(handlebarType);


    }
}
