package in.co.nmsworks.week5.day2;

public class Contact {
    private String name ;
    private long phoneNumber ;
    private String email ;

    public Contact(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Contact(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void add(String name,long phoneNumber , String email){
        this.name = name ;
        this.phoneNumber = phoneNumber;
        this.email = email ;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' ;

    }


}
