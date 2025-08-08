package in.co.nmsworks.week1.day3;


public class CandidateInfo {

       private int id;
       private String name;
       private String email;
       private String department;

    public CandidateInfo() {

    }

    public CandidateInfo(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    public void printTheinfostudent() {
        System.out.println("Student Id is : " + id);
        System.out.println("Student Name is : " + name);
        System.out.println("Student Email is : " + email);
        System.out.println("Student Department is : " + department);
        System.out.println();

    }

    private void printCandidateinfo(CandidateInfo candidateInfo) {
        System.out.println("Student Id is : " + id);
        System.out.println("Student Name is : " + name);
        System.out.println("Student Email is : " + email);
        System.out.println("Student Department is : " + department);
        System.out.println();

    }

}