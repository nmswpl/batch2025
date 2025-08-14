package in.co.nmsworks.week2.day2;

public class Employee {

    public Employee(int hourse, float bPlane,int noDays) {
        this.hourse = hourse;
        this.bPlane = bPlane;
        this.noDays=noDays;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "hourse=" + hourse +
                ", bPlane=" + bPlane +
                ", noDays=" + noDays +
                '}';
    }

    private int hourse;
    private float bPlane;
    private int noDays;

    public Employee(){

    }

    public void setbPlane(float bPlane) {
        this.bPlane = bPlane;
    }

    public float getbPlane() {
        return bPlane;
    }

    public void setHourse(int hourse) {
        this.hourse = hourse;
    }

    public int getHourse() {
        return hourse;
    }

    public float displaySalary(){

        double salary=hourse*bPlane*noDays;
        return getHourse()*getbPlane();
    }
}
