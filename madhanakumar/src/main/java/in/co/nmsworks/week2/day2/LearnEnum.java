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

    public static void main(String[] args) {
        LearnEnum e1 = new LearnEnum();

        String name = "Madhan";

        Gender gen1 = Gender.MALE;
        e1.test();
    }

    public void test(){

        String str = "MALE";
        Gender gender = Gender.valueOf(str);
        System.out.println(gender);
        switch (gender){
            case MALE :
            case FEMALE:
                System.out.println("It is a Primary Gender............");
                break;
            case OTHERS:
                System.out.println("Gender is Others............");
        }

        if (Gender.MALE == gender){
            System.out.println("Recieved Gender is Male.....");
        } else {
            System.out.println("Recieved Gender is Female.....");
        }

        System.out.println(gender.name());
        Gender.values();
    }
}
