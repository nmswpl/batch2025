package in.co.nmsworks.week1.test;

public class HundredPositionValue {
    public void findHundredPositionValue(int number){
        int qoutient = number / 100;
        switch (qoutient){
            case 0 :
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Not a Three Digit Number");
                break;
        }
    }

    public static void main(String[] args) {
        HundredPositionValue pv = new HundredPositionValue();
        int number1 = 542;
        int number2 = 777;
        pv.findHundredPositionValue(number1);
        pv.findHundredPositionValue(number2);
    }
}
