package in.co.nmsworks.week1.day2;

public class AlphabetPattern {

    static void alphabetPattern(int value){
        for(int i=0;i<value;i++){
            for(int j=0;j<=i;j++){
                int charValue=65+i;
                //char result= (char) charValue;
                System.out.print((char) charValue+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        alphabetPattern(4);
        //char a=65;
        //int b= 66;
        //System.out.println(char(b));
    }
}
