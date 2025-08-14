package in.co.nmsworks.week2.day2;

public class Contructor extends Employee{

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

    int hourse=15;
    float bPlane;
    int noDays=8;




}
