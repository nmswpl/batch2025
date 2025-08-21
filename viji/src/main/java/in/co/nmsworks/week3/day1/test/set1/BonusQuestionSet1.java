package in.co.nmsworks.week3.day1.test.set1;

public class BonusQuestionSet1 {

    public static void main(String[] args) {
        String binaryValue = convertIntToBinaryValue(8);
        System.out.println(binaryValue);

        int decimalValue = convertBinaryToDecimal("1000");
        System.out.println(decimalValue);
        
    }

    public static String convertIntToBinaryValue(int n) {

        int remainder ;
        String result = "";
        while(n > 0 ){
            remainder = n % 2 ;
            n = n/2 ;
            result = remainder + result ;
        }
        return result ;

    }

    public static int convertBinaryToDecimal(String str){
        int remainder ;
        int answer =0 ;
        int position = 0;
        int number = Integer.parseInt(str);
        while(number > 0){
            remainder = number % 10 ;
            answer += remainder * Math.pow(2, position);
            position++ ;
            number = number /10 ;

        }
        return answer ;
    }
}



