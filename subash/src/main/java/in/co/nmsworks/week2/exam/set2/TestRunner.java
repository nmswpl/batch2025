package in.co.nmsworks.week2.exam.set2;

public class TestRunner {

    public static void main(String[] args) {

        String paragraph="The quick brown fox jumped over the lazy dog.It was a sunny day.The dog barked loudly";
       int finalArr[]= positions(paragraph);
        for(int i=0;i<finalArr.length;i++)
        {
//            System.out.print(finalArr[i]+" ");
        }

        Intern intern1=new Intern("Subash",30000);
        Intern intern2=new Intern("Mathi",40000);
        Intern intern3=new Intern("Madhan",20000);
        Intern internArray[]=new Intern[]{intern1,intern2,intern3};
        calculateAvg(internArray);

        Wallet wallet=new Wallet();
        wallet.deposit(200);
    }


    public static int[] positions(String paragraph)
    {
        String arr[]=paragraph.split("\\.");
        String arr1[]=paragraph.split(" ");
        String arr2[]=paragraph.split("");
        int zerothPosition=arr.length;
        int firstPosition=arr1.length;
        int secondPosition=arr2.length;

        int finalArr[]=new int[]{zerothPosition,firstPosition,secondPosition};
        return finalArr;

    }
    public static void calculateAvg(Intern intern[])
    {
        int sum=0;
        for(int i=0;i<intern.length;i++)
        {
            sum=sum+intern[i].getSalary();
        }
        int avg=sum/ intern.length;
        System.out.println(avg);
    }


}
