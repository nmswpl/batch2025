package in.co.nmsworks.week1.day2.string;

public class LeadingZeroes {
    public static void removeLeadingZeroes(String num){
        String str = "";
        for(int i=0;i<=num.length()-1;i++){
            if(num.charAt(i) != '0') {
                System.out.println(num.substring(i));
                break;
            }
        }
    }

    public static void main(String[] args) {
        String num = "0005640";
        removeLeadingZeroes(num);
    }
}
