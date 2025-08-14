package in.co.nmsworks.week2.day4;

import in.co.nmsworks.week2.day2.Employee;

public class NewManager extends NewEmployee {
    double bonus;
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
}
