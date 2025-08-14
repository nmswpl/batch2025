package in.co.nmsworks.week1.test;

public class HunderedthPositionOfTheValue {
    static void printHunderedthPosition(int value){
        String [] positionValues={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int hunderedthValue=0;
        for(int i=0;i<3;i++){
            hunderedthValue=value%10;
            value=value/10;
        }
        System.out.println(positionValues[hunderedthValue]);

    }
    public static void main(String[] args) {
        int inputValue=789;
        printHunderedthPosition(inputValue);
    }
}
