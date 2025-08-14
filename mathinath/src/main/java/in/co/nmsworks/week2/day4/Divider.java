package in.co.nmsworks.week2.day4;

public class Divider implements Computable{

    public Divider() {

    }

    @Override
    public int compute(int a, int b) {
        if(b !=0)
        {
            return a/b;
        }
        else
        {
            return 0;
        }
    }
}
