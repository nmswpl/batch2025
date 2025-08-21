package in.co.nmsworks.week3.day4;


import java.util.List;

public class MemberApp {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();

        Member newMember = new Member(36, "durga", "durga@example.com", "dev", "f");
        dao.insertMember(newMember);

        List<Member> allMembers = dao.getAllMembers();

        for (Member m : allMembers) {
            System.out.println("ID: " + m.getId());
            System.out.println("Name: " + m.getName());
            System.out.println("Email: " + m.getEmail());
            System.out.println("Type: " + m.getType());
            System.out.println("Gender: " + m.getGender());
            System.out.println(" ");
        }
    }
}

