package in.co.nmsworks.week1.day2;

public class SeventhTable {

public static void main(String[] args)
{
    int count=10;
    new SeventhTable().seventhTable(count);
}

public void seventhTable(int count)
{
    for(int i=1;i<=count;i++)
    {
        System.out.println(i*7);
    }
}
}


