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

        void getFromVal(){

        }
    }

    void test(){
        Gender gen=Gender.MALE;

        System.out.println(gen.name());

        switch (gen){
            case MALE :
                System.out.println("Male");
                break;
            case FEMALE:
                System.out.println("Female");
                break;
            case OTHERS:
                System.out.println("Others");
                break;
        }

        String str="MALE";
        Gender g1=Gender.valueOf(str);
        System.out.println(g1);


        if(Gender.MALE == g1){
            System.out.println("Male");
        }
        else{

        }

        System.out.println(Gender.values());

    }
    public static void main(String[] args) {
        String name ="Tharun";
        Gender gen=Gender.MALE;
        LearnEnum sample= new LearnEnum();
        sample.test();

    }
}
