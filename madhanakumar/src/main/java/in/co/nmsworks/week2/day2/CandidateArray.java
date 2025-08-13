package in.co.nmsworks.week2.day2;

public class CandidateArray {
    private int id;
    private String name;
    private String email;
    private String department;

    public CandidateArray() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public CandidateArray(int id, String name, String email, String department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
    }


    @Override
    public String toString() {
        return "CandidateArray { " +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "department='" + department + '\'' +
                '}';
    }

    public static void main(String[] args) {

        CandidateArray ca = new CandidateArray();
        ca.arrayExample();
    }

    public void arrayExample(){
        CandidateArray c21 = new CandidateArray(21, "Arunkumar M","gajendrans@nmsworks.co.in","QA");
        CandidateArray c22 = new CandidateArray(22, "Vasanth S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c23 = new CandidateArray(23, "Nandhakumar M","gajendrans@nmsworks.co.in","QA");
        CandidateArray c24 = new CandidateArray(24, "Ramya S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c25 = new CandidateArray(25, "Neha S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c26 = new CandidateArray(26, "Sabarishwaran S","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c27 = new CandidateArray(27, "Elakkiya S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c28 = new CandidateArray(28, "Ellammal","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c29 = new CandidateArray(29, "Kavibharathi S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c30 = new CandidateArray(30, "Kabilan R","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c31 = new CandidateArray(31, "Velmurugan S","gajendrans@nmsworks.co.in","QA");
        CandidateArray c32 = new CandidateArray(32, "Amarnath M","gajendrans@nmsworks.co.in","Dev");
        CandidateArray c33 = new CandidateArray(33, "Vinothkumar E","gajendrans@nmsworks.co.in","QA");
        CandidateArray c34 = new CandidateArray(34, "Kanagavel N","gajendrans@nmsworks.co.in","Dev");

        CandidateArray[] candidates = new CandidateArray[]{c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34};

        System.out.println(candidates.length);


        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i]);
        }

        for (CandidateArray i : candidates){
            System.out.println(i.getId());
        }

        for (CandidateArray i : candidates){
            String dept = i.getDepartment();
            if (dept.equalsIgnoreCase("qa")){
                System.out.println(i.getName());
            }
        }
    }


}

