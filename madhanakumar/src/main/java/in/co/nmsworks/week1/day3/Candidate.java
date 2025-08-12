package in.co.nmsworks.week1.day3;

public class Candidate {

    private int id;
    private String name;
    private String email;
    private String department;

    public Candidate(){
    }

    public Candidate(int id, String name, String email, String department){
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setDepartment(String Department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
