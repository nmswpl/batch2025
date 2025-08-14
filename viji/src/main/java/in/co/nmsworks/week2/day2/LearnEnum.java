package in.co.nmsworks.week2.day2;

public class LearnEnum {

    public enum Gender{
        MALE(0),FEMALE(1) ,OTHERS(2);
        int numVal;

        Gender(int numVal) {
            this.numVal = numVal ;
        }

        public int getNumVal() {
            return numVal;
        }




    }


    public static void main(String[] args) {
          LearnEnum learn = new LearnEnum() ;
          learn.test();
          String name = "viji";
          Gender gen = Gender.MALE;
    }

    public void test(){

            Gender gen = Gender.FEMALE;
            switch (gen) {
                case MALE:
                    System.out.println("MALE");
                    break;
                case FEMALE:
                    System.out.println("FEMALE");
                    break;
                case OTHERS:
                    System.out.println("OTHERS");
                    break;

            }
             String str = "MALE";
            Gender g1=Gender.valueOf(str);
            System.out.println(g1);

            if(Gender.MALE == g1){
                System.out.println("Received gender is male");
            }
            else {
                System.out.println("Received gender is female");
            }
        System.out.println(gen.numVal);

            Gender.values();



    }

}
