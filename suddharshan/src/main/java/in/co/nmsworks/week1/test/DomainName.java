package in.co.nmsworks.week1.test;

public class DomainName {

    public static void main(String[] args) {
        String email = "suddharshanv@nmsworks.co.in";
        System.out.println(getDomainName(email));
    }

    public static String getDomainName(String email){
        int count = 0;
        for(int i = 0; i < email.length(); i ++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                count++;
            }
        }
        return email.substring(count+1);
    }
}
