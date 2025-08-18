package in.co.nmsworks.week2.test.set1;

public class TitleCase {
    public static void main(String[] args) {
        String name = "my name is harish";
        titleCase(name);
    }

    private static void titleCase(String name) {
        String[] splittedArray = name.split(" ");
        String emp = "";
        for(String i : splittedArray){
            emp = emp + i.substring(0,1).toUpperCase() + i.substring(1,i.length()) + " ";
        }
        System.out.println(emp);
    }
}
