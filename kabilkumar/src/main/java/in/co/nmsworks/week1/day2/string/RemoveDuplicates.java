package in.co.nmsworks.week1.day2.string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String givenData="aabbucc";
        removeDuplicates(givenData);
    }
    public static void removeDuplicates(String dataString)
    {
      dataString.toLowerCase();
      String result="";
      for(int i=0;i<dataString.length();i++)
      {
          char ch=dataString.charAt(i);
          if(result.indexOf(ch)==-1)
          {
              result=result+ch;
          }
      }
      System.out.println("Before Duplicate  : "+dataString);
      System.out.println("After Duplicate :  "+ result);
    }
}
