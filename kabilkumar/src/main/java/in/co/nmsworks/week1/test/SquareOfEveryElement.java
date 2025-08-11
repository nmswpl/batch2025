package in.co.nmsworks.week1.test;

public class SquareOfEveryElement
{
    public static void main(String[] args) {
        int[] givenArr={2,4,3,5};
        elementValueSquare(givenArr);

    }
    public static void elementValueSquare(int[] dataGet)
    {
        for(int i=0;i< dataGet.length;i++)
        {
            System.out.println(dataGet[i]*2);
        }
    }
}
