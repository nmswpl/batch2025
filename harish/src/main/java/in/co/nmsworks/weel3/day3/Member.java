package in.co.nmsworks.weel3.day3;

public class Member {
    private int id;
    private String name;
    private String email;
    private String type;
    private String gender;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Member(){

    }
    Member(int id , String name, String email, String type, String gender){
        this.id = id;
        this.name = name;
        this.email = email;
        this.type = type;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }


    public String getType() {
        return type;
    }


    public String getEmail() {
        return email;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return " Id : " + getId() + " Name : " + getName() + " Email : " + getEmail() + " Type : " + getType() + " Gender: " + getGender();
    }
}
