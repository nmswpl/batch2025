package in.co.nmsworks.week2.day4;

public class SimpleAdder implements Sequence{

    private int current;
    private int step;

    public SimpleAdder(int start, int step){
            this.current = start;
            this.step = step;
        }

    @Override
    public int next() {

        current=current+step;
        return current;

    }
}
