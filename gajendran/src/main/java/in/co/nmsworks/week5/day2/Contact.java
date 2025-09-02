package in.co.nmsworks.week5.day2;

public class Contact
{
    String name;
    long number;
    String email;

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", number = " + number +
                ", email = " + email;
    }

    public Contact(String name, long number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
}
