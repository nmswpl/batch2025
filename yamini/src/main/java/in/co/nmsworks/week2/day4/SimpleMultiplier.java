package in.co.nmsworks.week2.day4;

public class SimpleMultiplier implements Sequence{
    private  int current;
    private int ratio;


    public SimpleMultiplier(int start, int ratio) {
        this.current = start;
        this.ratio=ratio;

    }

    @Override
    public int next() {
        current=current*ratio;
        return  current;
    }
}
