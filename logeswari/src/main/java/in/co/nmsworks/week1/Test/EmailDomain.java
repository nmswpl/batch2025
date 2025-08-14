package in.co.nmsworks.week1.Test;

public class EmailDomain {
    public static void displayDomain() {
        String email = "john.doe@gmail.com";

        String domain = "";
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'g' || ch == 'm' || ch == 'a' || ch == 'i' || ch == 'l' || ch == 'c' || ch == 'o') {
//               domain++;
                }
                System.out.println(domain);

            }

        }
    }

    public static void main(String[] args) {
        displayDomain();
    }
}