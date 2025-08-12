package in.co.nmsworks.week2.day2;

public class EnumExample {

    int age;


    public enum Gender{
        MALE(0),FEMALE(1),OTHERS(2);
        int numValue;

        public int getNumValue() {
            return numValue;
        }

        Gender(int numvalue) {
            this.numValue = numvalue;
        }
    }

    public static void main(String[] args) {
        EnumExample t1 = new EnumExample();
        t1.test();
        String name = "harish";
        Gender gen = Gender.MALE;

    }
    public void test(){

        Gender gen = Gender.FEMALE;
        String str = "MALE";
        Gender g1 = Gender.valueOf(str);
        if(Gender.MALE == g1){
            System.out.println(g1);
        }
        gen.name();

        gen.numValue = 45;

        System.out.println(Gender.values());

        System.out.println(g1);
        switch (gen){
            case MALE:
                System.out.println("The given is male");
                break;
            case FEMALE:
                System.out.println("She is female");
                break;
            case OTHERS:
                System.out.println("he/she is others");
                break;
        }
    }
}
