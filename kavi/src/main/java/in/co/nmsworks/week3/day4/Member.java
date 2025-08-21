package in.co.nmsworks.week3.day4;

public class Member {
    private int id;
    private String name;
    private String email;
    private String type;
    private String gender;

    public Member(int id, String name, String email, String type, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getType() {
        return type;
    }
    public String getGender() {
        return gender;
    }
}
