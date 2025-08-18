package in.co.nmsworks.week2.day1.day2;

public class EnumExample
{
    int age;
    public enum gender {
        MALE(0),FEMALE(1),OTHERS(2);
    int numVal;



        gender(int numVal)
        {
            this.numVal = numVal;
        }
        public int getNumVal() {
            return numVal;
        }

    }


    public static void main(String[] args) {
        EnumExample  obj =  new EnumExample();
        obj.test();
        //age = 5;
        String name="kabil";
        gender gen = gender.FEMALE;
    }
    public static void test()
    {
       gender gen = gender.MALE;

       String str = "MALE";
        gender g1 = gender.valueOf(str);
        System.out.println(g1);
        //gen.numVal();
        System.out.println();

        gender.values();


        gen.getNumVal();
        System.out.println(gen);

       switch (gen)
       {
           case MALE :
               System.out.println("male");
               break;
           case FEMALE:
               System.out.println("female");
               break;
           case OTHERS:
               System.out.println("others");


        if(gender.MALE == gen)
    {
        System.out.println(gen);
        }

       }

    }

}
