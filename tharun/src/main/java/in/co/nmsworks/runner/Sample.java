package in.co.nmsworks.runner;

import java.util.Objects;

public class Sample {
    int sNo;
    String something;


    public Sample(){

    }

    public Sample(int sNo, String something) {
        this.sNo = sNo;
        this.something = something;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sample sample = (Sample) o;
        return sNo == sample.sNo && Objects.equals(something, sample.something);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sNo, something);
    }

    @Override
    public String toString() {
        return "Sample => " +
                "sNo = " + sNo +
                ", something = " + something ;
    }
}
