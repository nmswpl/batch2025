package in.co.nmsworks.week2.day1.day2;

public class LearnEnum {

    int age;


    public enum GENDER {

        MALE(0),FEMALE(1),OTHERS(2);

        int numVal;

        public int getNumVal() {
            return numVal;
        }

        GENDER(int numVal) {
            this.numVal=numVal;


        }
    }

    public static void main(String[] args) {

       LearnEnum l1 =  new LearnEnum();
        l1.test();
        String name="Subash";
        GENDER gen;
    }

    public void test()
    {

        GENDER gen = GENDER.MALE;
        switch (gen)
        {
            case MALE:
                break;
            case FEMALE:
                break;
            case OTHERS:
                break;
        }
        String str1="MALE";
        gen=GENDER.valueOf(str1);
        System.out.println(gen);

        if(GENDER.MALE==gen)
        {
            System.out.println("is male");
        }
        else
            System.out.println("Female");

        System.out.println(gen.name());
        gen.getNumVal();
        System.out.println(GENDER.values());


    }
}
