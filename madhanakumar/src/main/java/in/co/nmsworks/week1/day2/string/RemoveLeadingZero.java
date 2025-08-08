package in.co.nmsworks.week1.day2.string;

public class RemoveLeadingZero {
    //Remove Leading Zero
    public void removeLeadingZero(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0'){
                System.out.print(s.substring(i));
                break;
            }
        }
    }
    public static void main(String[] args) {
        RemoveLeadingZero rl = new RemoveLeadingZero();
        rl.removeLeadingZero("0005640");
    }

}
