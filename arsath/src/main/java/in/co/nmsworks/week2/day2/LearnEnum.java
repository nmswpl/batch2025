package in.co.nmsworks.week2.day2;

public class LearnEnum {
    int age;
    public enum Gender{
        MALE(0),
        FEMALE(1),
        OTHERS(2);

        int numVal;

        Gender(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }
    }

    private void test() {
        Gender gen = Gender.MALE;
       // System.out.println(Arrays.toString(Gender.values()));
        switch (gen){
            case MALE :
            case FEMALE :
                System.out.println("Primary Gender");
                break;

            case OTHERS :
                break;
        }

        String str = "FEMALE";

        Gender g1 = Gender.valueOf(str);
        System.out.println(g1);

        if(Gender.FEMALE == gen){
            System.out.println("Gender is male");
        }
        else{
            System.out.println("Gender is female");
        }

        String name = g1.name();
        System.out.println(name);


        System.out.println(g1.numVal);


    }


    public static void main(String[] args) {
        LearnEnum obj = new LearnEnum();
        obj.test();

        String name = "Arsath";

        Gender gen = Gender.MALE;
    }




}
