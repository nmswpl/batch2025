package in.co.nmsworks.week2.day2;

public class Employee {

    int fullTimeSal = 10;
    int partTimeSal = 5;

    public int getFullTimeSal() {
        return fullTimeSal * getFullTimeSal();
    }

    public void setFullTimeSal(int fullTimeSal) {
        this.fullTimeSal = fullTimeSal * getFullTimeSal();
    }

    public int getPartTimeSal() {
        return partTimeSal;
    }

    public void setPartTimeSal(int partTimeSal) {
        this.partTimeSal = partTimeSal;
    }

    public int getConTimeSal() {
        return conTimeSal;
    }

    public void setConTimeSal(int conTimeSal) {
        this.conTimeSal = conTimeSal;
    }

    int conTimeSal = 3;



}