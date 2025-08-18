package in.co.nmsworks.week2.test.set1;

public class TestRunner {
    public static void main(String[] args) {
        String sentence = "this is simple question";
        System.out.println(getTitleCase(sentence));

        Intern Hari = new Intern("Harish", "Dev");
        Intern Ram = new Intern("Ram", "Dev");
        Intern Krishna = new Intern("Krishna", "QA");
        Intern Devi = new Intern("Devi", "QA");
        Intern Meena = new Intern("Meena", "Dev");

        Intern intern[] = new Intern[] {Hari, Ram, Krishna, Devi, Meena};
        int arr[] = getNamesOfDept(intern, "Dev");
        for(int i =0; i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static String getTitleCase(String sentence){
        String arr[] = sentence.split(" ");
        String result = " ";
        for(int i = 0; i < arr.length;i++){
            result += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
        }
        return result;
    }

    public static int [] getNamesOfDept(Intern [] intern, String dept){
        int arr[] = new int[5];
        for(int i = 0; i < intern.length; i++){
            if(intern[i].getDept().equals("Dev")){
                arr[i] = i;
            }
        }
        return arr;
    }

}
