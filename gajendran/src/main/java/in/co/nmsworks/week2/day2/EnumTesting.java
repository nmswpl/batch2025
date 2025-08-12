package in.co.nmsworks.week2.day2;

class EnumExample {

    int age;

    public enum Gender {
        MALE(0), FEMALE(1), OTHER(2);

        int numValue;

        Gender(int numVale) {
            this.numValue = numVale;
        }

        public int getNumValue() {
            return numValue;
        }


    }

    public  void test(){

        Gender gen = Gender.FEMALE;
        switch(gen){
            case MALE:
                break;
            case FEMALE:
                break;
            case OTHER:
                break;
        }
        String str = "MALE";
        Gender  g1 = Gender.valueOf(str);
        System.out.println(g1);


        if(Gender.MALE == g1){
            System.out.println("Recived gender is MALE");
        }else{

            System.out.println("Recived gender is not MALE");
        }
        System.out.println(gen);
        gen.numValue = 10;
        Gender.values();
        //System.out.println(g2);


    }
    public static void main(String[] args) {

        String name = "Gajendran";
        EnumExample example1 = new EnumExample();
        example1.test();
        Gender gen = Gender.FEMALE;
    }

}
