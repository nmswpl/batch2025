package in.co.nmsworks.week2.day4;


public class SimpleAdder implements Sequence{


    private int start;
    private int step;

    public SimpleAdder(int start, int step){
            this.start = start;
            this.step = step;
        }

    @Override
    public int next() {
        return start++ + step++;

    }



}
