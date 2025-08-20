package in.co.nmsworks.week3.day3;

public class Members {

    private int id;
    private String name;
    private String type;
    private String email;
    private String gender;

    public Members() {
    }

    public Members(int id, String name, String type, String email, String gender) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
