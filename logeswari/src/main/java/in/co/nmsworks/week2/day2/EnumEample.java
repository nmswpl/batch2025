package in.co.nmsworks.week2.day2;

public class EnumEample {
    int age;
    public enum Gendet{
        MALE(0),
        FEMALE(1),
        OTHERS(2);

        public int getNumVal() {
            return numVal;
        }

        int numVal;

        Gendet(int numVal) {

        }


    }

    public static void main(String[] args) {
       EnumEample e1 =new EnumEample();
       e1.test();
       String name="logeswari";
       Gendet gen=Gendet.FEMALE;



    }
    public void test(){
        Gendet gen =Gendet.FEMALE;

        switch (gen){
            case MALE : {
                System.out.println("male");
                break;
            }
            case FEMALE : {
                System.out.println("female");
                break;
            }
            case OTHERS :{
                System.out.println("others");
                break;
            }

        }
        String s1= String.valueOf(Gendet.valueOf("FEMALE"));
        Gendet g1=Gendet.valueOf("FEMALE");
        Gendet[] g2=Gendet.values();
        if(Gendet.MALE==g1){
            System.out.println("male");
        }

        System.out.println("Gender using gen.name() : "+gen.name());
        System.out.println(s1);

        System.out.println("Gender :"+g1);
    }
}

