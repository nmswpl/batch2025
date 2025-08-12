package in.co.nmsworks.week2.day2;

public class LearnEnum
{
    int age;

    public enum Gender
    {
        MALE(0),FEMALE(1),OTHERS(2);
        int numVal;

        Gender(int i) {
            this.numVal = i;
        }


        public void setGenderValue(){

        }

    }

    public static void main(String[] args)
    {
        LearnEnum obj = new LearnEnum();
        obj.test();
        //age =5;
        String name = "fayas";
        Gender gen ;
    }
    public void test()
    {

        String str ="MALE";
        Gender g1 = Gender.valueOf(str);
        System.out.println(Gender.values());
        System.out.println(g1.name());
        //g1.name();
        if(Gender.MALE == g1){
            System.out.println("Recieves Male");
        }
        else{
            System.out.println("Receive Female");
        }
        Gender gen = Gender.MALE;
        switch(gen)
        {
            case MALE:
                break;
            case FEMALE:
                break;
            case OTHERS:
                break;

        }
    }
}
