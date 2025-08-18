package in.co.nmsworks.week2.day2;



public class LearnEnum {
    int age;

     public   enum Gender{
         MALE(0),
         FEMALE(1),
         OTHERS(2);
         int numVal;

         Gender(int numVal) {
             this.numVal= numVal;
         }


     }
    public  void test(){
           Gender gender = Gender.MALE;
           Gender gender1=Gender.FEMALE;
           String str="MALE";
           Gender gen=Gender.valueOf(str);
        System.out.println(gen);




           switch (gender){
               case MALE : System.out.println("Male");
               break;

               case FEMALE : System.out.println("Female");
               break;
               case OTHERS : System.out.println("Others");

           }
           if(Gender.MALE == gen){
               System.out.println("MALE");
           }

        System.out.println(gender1);
        System.out.println(gender1.name());



    }


    public static void main(String[] args) {
        LearnEnum example = new LearnEnum();
        example.test();
        String name="Saran";
        Gender gender= Gender.FEMALE;


    }
}
/*


 */