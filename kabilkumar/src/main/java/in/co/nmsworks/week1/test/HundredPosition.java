
package in.co.nmsworks.week1.test;


public class HundredPosition {
    public static void main(String[] args) {
        int num=123 ;
        convertHundreds(num);
    }

    public static void convertHundreds(int data)
    {
        String[] outPut = {"zero","one","two","three","four"};
        int result=0;
        for(int i=0;i<3;i++)
        {
            result = data%10;
            data = data/10;
        }
        System.out.println(outPut[result]);
    }
    }
