package in.co.nmsworks.week3.day1.day3;

public class Members {
    private int id;
    private String name;
    private String email;
    private String type;
    private String gender;

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Members(int anInt, String string, String resultString, String s){

    }

    public Members(int id, String name, String email, String type, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}

