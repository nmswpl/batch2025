package in.co.nmsworks.week2.day4;

public class Manager extends Employee {
    double bonus ;

    public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        @Override
        public double annualSalary(){
            return  (salaryPerMonth * 12) + bonus ;
        }
}
