package in.co.nmsworks.week3.day3;

public class Member {
    int id;
    String name;
    String email;
    String type;
    String gender;

    public Member(int id, String name, String email, String type, String gender) {
        this.id = id;
        this.name = name;

        this.email = email;
        this.type = type;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
