package in.co.nmsworks.week5.day2;

import java.util.Objects;

public class Contact implements Comparable<Contact> {
    @Override
    public int compareTo(Contact o) {
        if(this.getName().compareTo(o.getName()) == 0) {
            return 0;
        }
        else if(this.getName().compareTo(o.getName()) > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    private String name;
    private int phoneNo;
    private String email;

    public Contact(String name, int phoneNo, String email) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }
}
