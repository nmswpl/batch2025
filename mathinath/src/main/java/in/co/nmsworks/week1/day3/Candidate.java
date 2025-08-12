package in.co.nmsworks.week1.day3;

public class Candidate {
    private int id;
    private String name;
    private String email;
    private String department;

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    //default constructor
    public Candidate(){

    }

    //For id
    public void setId(int id)
    {
        this.id = id;
    }

    public int getid()
    {
        return id;
    }

    //For name
    public void setName(String name)
    {
        this.name = name;
    }

    public String getname()
    {
        return name;
    }

    //For Email
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getemail()
    {
        return email;
    }

    //For department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getdepartment()
    {
        return department;
    }
    public Candidate(int id,String name,String email,String department)
    {
       this.id = id;
       this.name = name;
       this.email = email;
       this.department = department;
    }

}
