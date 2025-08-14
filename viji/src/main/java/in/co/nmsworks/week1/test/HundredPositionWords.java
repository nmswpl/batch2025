
// given a three digit number 542 and 777

package in.co.nmsworks.week1.test;

public class HundredPositionWords {
    public static void main(String[] args) {
             printHundredPositionWords(542);
    }

    public static void printHundredPositionWords(int number){
      int num = number /100 ;
      switch (num){
          case 1 :
            System.out.println("One");
            break;
          case 2 :
              System.out.println("Two");
              break;
          case 3 :
              System.out.println("Three");
              break;
          case 4 :
              System.out.println("Four");
              break;
          case 5 :
              System.out.println("Five");
              break;
          case 6 :
              System.out.println("Six");
              break;
          case 7 :
              System.out.println("Seven");
              break;
          case 8 :
              System.out.println("Eight");
              break;
          case 9 :
              System.out.println("Nine");
              break;
      }
    }
}

