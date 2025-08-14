package in.co.nmsworks.week2.day2;

public class FullTimeEmployee extends Employee{
    @Override
    public void setHourse(int hourse) {
        this.hourse = hourse;
    }

    @Override
    public int getHourse() {
        return hourse;
    }


    @Override
    public void setbPlane(float bPlane) {
        this.bPlane = bPlane;
    }

    @Override
    public float getbPlane() {
        return bPlane;
    }

    int hourse;

    public int getNoDays() {
        return noDays;
    }

    public void setNoDays(int noDays) {
        this.noDays = noDays;
    }

    float bPlane;
    int noDays;

    public FullTimeEmployee(int hourse){
        this.hourse=hourse;
    }

}
