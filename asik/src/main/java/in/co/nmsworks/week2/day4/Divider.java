package in.co.nmsworks.week2.day4;

public class Divider implements Computable
{

    int errorCode = 0;
    @Override
    public int compute(int a, int b)
    {
        if ( b != 0)
        {
            return a / b;

        }
        errorCode = 1;
        return -1;
    }

}
