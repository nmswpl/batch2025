package in.co.nmsworks.week1.day2.string;

public class SplitTheSentense
{
    public static void main(String[] args) {


        String givenSentense = " Hai . This is Kabilkumar . from . Krishnagiri";
        divideTheSentense(givenSentense);
    }
    public  static void divideTheSentense(String getData)
    {
        String [] sentense=getData.split("\\.");
        for(int i=0;i<sentense.length;i++)
        {
            System.out.println(sentense[i]);
        }
    }
}
