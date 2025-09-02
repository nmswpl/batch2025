package in.co.nmsworks.week5.day2;

public class Contact {
    private String name;
    private int mobileNo;
    private String email;

    public Contact() {
    }

    public Contact(String name, int mobileNo, String email) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", email='" + email + '\'' +
                '}';
    }
}
