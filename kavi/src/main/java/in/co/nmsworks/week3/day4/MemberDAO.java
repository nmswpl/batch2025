package in.co.nmsworks.week3.day4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    private final String url = "jdbc:mysql://localhost:3306/training";
    private final String user = "nms-training";
    private final String password = "nms-training";


    public void insertMember(Member member) {
        String query = "INSERT INTO members (id, name, email, type, gender) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, member.getId());
            stmt.setString(2, member.getName());
            stmt.setString(3, member.getEmail());
            stmt.setString(4, member.getType());
            stmt.setString(5, member.getGender());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Member inserted");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public List<Member> getAllMembers() {
        List<Member> membersList = new ArrayList<>();
        String query = "SELECT * FROM members";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Member member = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("type"),
                        rs.getString("gender")
                );
                membersList.add(member);
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        return membersList;
    }
}
