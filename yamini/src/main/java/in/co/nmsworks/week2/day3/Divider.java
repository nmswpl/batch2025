package in.co.nmsworks.week2.day3;

import in.co.nmsworks.week2.Computable;

public class Divider implements Computable {
    @Override
    public int compute(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }
}
