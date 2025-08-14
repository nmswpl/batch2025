package in.co.nmsworks.week2.day2;

public class EnumExample {

    int age;

    public enum Gender{
        MALE(0),
        FEMALE(1),
        OTHERS(2),
        ;
        int numVal;

        Gender(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }

        //public Gender getFromNumVal(int numVal){
           // return " ";
       // }


    }

    public static void main(String[] args) {

        EnumExample e1 = new EnumExample();
        e1.test();

        String name = "Anu";
        Gender gen = Gender.FEMALE;
    }

    public void test(){
        Gender gen = Gender.FEMALE;
        Gender.values(); // return an array of enum
        //gen.getFromNumVal(0);

        switch(gen){
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

        String str1 = "MALE";
        Gender g1 = Gender.valueOf(str1);
        System.out.println(g1);

        if(Gender.MALE == g1){
            System.out.println("Received gender is male");
        }
        else{
            System.out.println("Received gender is female");
        }

        System.out.println(gen.name());
    }
}
