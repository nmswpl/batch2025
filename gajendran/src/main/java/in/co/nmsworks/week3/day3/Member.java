package in.co.nmsworks.week3.day3;

public class Member {

    private String name;
    private String gender;
    private String email;
    private String type;
    private int id;


    @Override
    public String toString() {
        return "id =" + id + ", name = " + name + ", gender = " + gender + ", email = " + email + ", type = " + type;
    }


        public Member(int id, String name, String type, String email, String gender) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.gender = gender;
    }
}
