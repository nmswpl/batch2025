package in.co.nmsworks.week5.day2;

public class contact
{
    private String name;
    private long mobNumber;
    private String email;



    public contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(long mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public contact(String name, long mobNumber, String email) {
        this.name = name;
        this.mobNumber = mobNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneBookManager{" +
                "name='" + name + '\'' +
                ", mobNumber=" + mobNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
