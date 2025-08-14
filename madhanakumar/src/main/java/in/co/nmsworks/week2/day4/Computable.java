package in.co.nmsworks.week2.day4;

public interface Computable {
    default int compute (int a, int b) {

        return a;
    }
}
