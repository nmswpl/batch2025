package in.co.nmsworks.week2.day2;

public class LearnEnum {



    public enum Gender {
        MALE(0), FEMALE(1), OTHERS(2);

        int numVal;

        public int getNumVal() {
            return numVal;
        }

        Gender(int i) {
            this.numVal = i;

        }
    }
    public  void test() {
        Gender gen = Gender.MALE;

        switch (gen) {
            case MALE: {

            }
            case FEMALE:{

            }
            case OTHERS: {

            }
        }

        String str = "MALE";
        Gender g1 = Gender.valueOf(str);
        System.out.println(g1);

        if (Gender.MALE == g1) {

        }

        System.out.println(gen.name());


    }


    public static void main(String args[]) {
        String name = "Fiyaz Moahmed";
        Gender gen = Gender.MALE;
        LearnEnum l = new LearnEnum();
        l.test();



    }

}