package in.co.nmsworks.week2.day2;

public class EnumExample {
    int age;
    public enum Gender{

        MALE(0),
        FEMALE(1),
        OTHERS(2);
        int numVal;

        Gender(int numVal) {
            this.numVal=numVal;
        }

        public int getNumVal() {
            return numVal;
        }

    }

    public static void main(String args[]) {
        EnumExample e1=new EnumExample();
        String name="kavi";
        Gender gen=Gender.FEMALE;
        int numVal = gen.numVal;



    }
    public static void test(){
        Gender gen=Gender.MALE;
        switch(gen){
            case MALE:
                System.out.println("male");
                break;
            case FEMALE:
                System.out.println("female");
                break;
            case OTHERS:
                System.out.println("others");
                break;

        }
        String str1="MALE";
        Gender g1=Gender.valueOf(str1);
        System.out.println(g1);

        if(Gender.MALE==g1){
            System.out.println("received gender is male");
        }
        else{
            System.out.println("received gender is female");
        }
        gen.name();
        Gender.values();




    }

}
