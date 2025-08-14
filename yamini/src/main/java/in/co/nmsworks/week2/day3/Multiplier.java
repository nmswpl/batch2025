package in.co.nmsworks.week2.day3;

import in.co.nmsworks.week2.Computable;

public class Multiplier implements Computable {
    @Override
    public int compute(int a, int b) {
        return a*b;
    }
}
