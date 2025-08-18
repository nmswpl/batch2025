package in.co.nmsworks.week2.day2;

public class EnumExample {

    int age;

    public enum Gender {
        MALE (0),
        FEMALE (1),
        OTHERS (2);
        int numVal;

        Gender(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }

//        public Gender getFromNumVal() {
//
//        }
    }

    public void test(){
        Gender gen = Gender.FEMALE;
        switch (gen) {
            case MALE -> System.out.println("Male");
            case FEMALE -> System.out.println("Female");
            case OTHERS -> System.out.println("Others");
        }


        String str = "MALE";
        Gender g1 = Gender.valueOf(str);
        System.out.println(g1);
        if(Gender.MALE == g1) {
            System.out.println("Received gender is male");
        }
        else {
            System.out.println("Received gender is female");
        }
        System.out.println(gen.name());
//        gen.numVal = 10;
        ;
        System.out.println(Gender.values());
    }




    public static void main(String[] args) {
        EnumExample enum1 = new EnumExample();
        enum1.test();
//        age = 5;
        String name = "Mahalakshmi";
        Gender gen = Gender.FEMALE;
    }


}
