package in.co.nmsworks.week2.day2;

public class Constructor extends Employee{

    int hours=10;
    int basepay =3;

    public Constructor(){

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getBasepay() {
        return basepay;
    }

    public void setBasepay(int basepay) {
        this.basepay = basepay;
    }

    public Constructor(int hours, int basepay) {
        this.hours = hours;
        this.basepay = basepay;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "hours=" + hours +
                ", basepay=" + basepay +
                '}';
    }
}
