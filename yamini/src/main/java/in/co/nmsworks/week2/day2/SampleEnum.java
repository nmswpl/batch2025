package in.co.nmsworks.week2.day2;

import com.mysql.cj.protocol.a.NativeConstants;

public class SampleEnum {
    public enum Gender {
        MALE(0), FEMALE(1), OTHERS(2);
        int numVal;

        Gender(int numVal) {
            this.numVal=numVal;
        }

        public int getNumVal(){
            return numVal;
        }

        public void getFromNumVal(){

        }
    }

    public static void main(String[] args) {
        SampleEnum sample = new SampleEnum();
        sample.test();
        String name = "Yamini";
        Gender gen1;
    }

    public void test() {
        Gender gen1 = Gender.MALE;
        Gender.values();
        switch (gen1) {
            case MALE:
            case FEMALE:
                System.out.println("PG");
                break;
            case OTHERS:
                System.out.println();
                break;
        }
        String s1="MALE";
        Gender g1=Gender.valueOf(s1);
        System.out.println(g1);
        if(Gender.MALE==g1){
            System.out.println("Recieved gender is Male");
        }
        System.out.println(g1.name());

    }
}
