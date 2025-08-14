package in.co.nmsworks.week2.day4;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        int result=0;
        try{
            result =  a / b;
        }catch (Exception e){
            System.out.println(e);
        }
      return result;
    }
}
