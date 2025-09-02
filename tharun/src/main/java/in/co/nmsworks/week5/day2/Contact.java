package in.co.nmsworks.week5.day2;

public class Contact {
    private String name;
    private String pbNumber;
    private String email;

    public Contact(String name, String pbNumber, String email) {
        this.name = name;
        this.pbNumber = pbNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPbNumber() {
        return pbNumber;
    }

    public void setPbNumber(String pbNumber) {
        this.pbNumber = pbNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactDetails{" +
                "name='" + name + '\'' +
                ", pbNumber='" + pbNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
