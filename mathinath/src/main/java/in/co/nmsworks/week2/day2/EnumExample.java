package in.co.nmsworks.week2.day2;

public class EnumExample {
    int age;

    public enum Gender{
        MALE(0),FEMALE(1),OTHERS(2);
        int numVal;


        Gender(int numVal) {
            this.numVal=numVal;
        }

        public int getNumVal()
        {
            return numVal;
        }

    }

    public static void main(String[] args) {
      EnumExample e1=new EnumExample();
      e1.test();
      String name="Mathi";
      Gender gender=Gender.FEMALE;
    }

    public void test()
    {
        Gender gen=Gender.MALE;
        switch(gen)
        {
            case MALE :
            {
                break;
            }
            case FEMALE:
            {
                break;
            }
            case OTHERS:
            {
                break;
            }
        }
        String str1="MALE";
        Gender g1=Gender.valueOf(str1);
        System.out.println(g1);
        if(Gender.MALE == g1)
        {
            System.out.println("Received gender is male");
        }
        else
        {
            System.out.println("received gender is female");
        }
        System.out.println(gen.name());
        System.out.println(gen.numVal);

        System.out.println( Gender.values());
    }
}
