package in.co.nmsworks.week1.day2.string;

public class ChangeFirstCharCaps
{
    public static void main(String[] args) {
        String str="the quick brown fox";
        changeFirstChar(str);
    }
    public static void changeFirstChar(String str){
        String [] zs = str.split(" ");
        for(int i=0;i<zs.length;i++){
            if(zs[i].length()>0) {
                String capitalized = Character.toUpperCase(zs[i].charAt(0)) + zs[i].substring(1);
                System.out.print(capitalized + " ");
            }

        }
    }
}
