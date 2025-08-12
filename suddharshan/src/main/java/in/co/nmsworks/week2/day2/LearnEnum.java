package in.co.nmsworks.week2.day2;

public class LearnEnum {
    int age;
    public enum Gender {
        MALE(0), FEMALE(1), OTHERS(2);
        int numVal;

        Gender(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }


    }

    public void test(){
        System.out.println(Gender.values());
        Gender gen = Gender.MALE;
        switch (gen){
            case MALE:
            {
                System.out.println("Male");
                break;
            }
            case FEMALE:
            {
                System.out.println("Female");
                break;
            }
            case OTHERS:
            {
                System.out.println("Others");
                break;
            }
        }
        String str = "MALE";
        Gender g1 = Gender.valueOf(str);
        System.out.println(g1);
        if(Gender.MALE == g1){
            System.out.println("Received Gender is Male");
        }
        else{
            System.out.println("Received Gender is Female");
        }
        System.out.println(gen.name());
    }
    public static void main(String[] args) {
        String name = "Suddharshan";

        LearnEnum l = new LearnEnum();
        l.test();
    }
}
