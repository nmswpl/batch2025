package in.co.nmsworks.week1.day3;

public class Candidate {
    private String name;
    private int id;
    private String email;
    private String department;

    public Candidate(){
    }

    public Candidate(String name, int id, String email, String department){
        this.name = name;
        this.id = id;
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
}
