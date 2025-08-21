package in.co.nmsworks.week3.day3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberMain {
    public static void main(String[] args)  {
        Member member = new Member();
        List<Member> membersList = new ArrayList<>();
        try {
            member.establishConnection(membersList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
