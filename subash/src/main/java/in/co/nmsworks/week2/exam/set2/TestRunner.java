package in.co.nmsworks.week2.exam.set2;

public class TestRunner {

    public static void main(String[] args) {

        String paragraph="The quick brown fox jumped over the lazy dog.It was a sunny day.The dog barked loudly";
       int finalArr[]= positions(paragraph);
        for(int i=0;i<finalArr.length;i++)
        {
            System.out.print(finalArr[i]+" ");
        }
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


}
