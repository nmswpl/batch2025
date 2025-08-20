package in.co.nmsworks.week3.day3;

public class Member {
    private int id;
    private String name;
    private String type;
    private String email;
    private String gender;

    public Member(int id, String name, String type, String email, String gender) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setDept(String gender) {
        this.gender = gender;
    }
}
