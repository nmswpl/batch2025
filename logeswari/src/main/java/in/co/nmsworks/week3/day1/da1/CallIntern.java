package in.co.nmsworks.week3.day1.da1;

public class CallIntern {
    public static void main(String[] args) {
        Intern intern1=new Intern("logu","dev");
        Intern intern2=new Intern("logu","dev");
        Intern intern3=new Intern("logu","dev");
        Intern intern4=new Intern("logu","dev");
        Intern intern5=new Intern("logu","dev");

        System.out.println("intern 1 "+intern1.toString());

    }
    public static int[] PrintIntern(Intern intern[],String dept){
        for (int i = 0; i < intern.length; i++) {
            System.out.println("PrintLength : "+i);
            System.out.println("list of intern Array : "+intern.toString());

        }

        return new int[0];
    }
}
