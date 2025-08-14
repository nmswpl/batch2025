package in.co.nmsworks.week1.test;

public class HundedDigit {

        public static void main(String[] args) {
          printHundredDigit();
        }
        public static void printHundredDigit(){
            int number = 542;
            String[] arr={"one","two","three","four","five","six","seven","eight","nine"};
            int hundredsDigit = number / 100;
            System.out.print(hundredsDigit);
        }
}

