package in.co.nmsworks.week5.day2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection
{
    ResultSet rs;

    String url = "jdbc:mysql://localhost:3306/training";
    String host = "nms-training";
    String pass = "nms-training";

    public int addToDB(contact pbm)
    {
        String query = "INSERT into phonebookmanager values(?,?,?)";
        int num=0;
       try (Connection conn = DriverManager.getConnection(url,host,pass);
            PreparedStatement ps =conn.prepareStatement(query))
        {
            ps.setString(1,pbm.getName());
            ps.setLong(2,pbm.getMobNumber());
            ps.setString(3,pbm.getEmail());
            num = ps.executeUpdate();

        } catch (SQLException e) {
           throw new RuntimeException(e);
       }
       return num;

    }

    public void listFromDb()
    {
        String query = "Select * from phonebookmanager";
        boolean found;
        List<contact> contactList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url,host,pass);
             PreparedStatement ps =conn.prepareStatement(query))
        {
            rs=ps.executeQuery();
            while (rs.next())
            {
                found=true;
                contactList.add(new contact(rs.getString(1),rs.getLong(2),rs.getString(3)));
            }
            rs.close();
            System.out.println(contactList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void searchOnDB()
    {
        String query = "Select * from phonebookmanager where name=?";
        boolean found;
        List<contact> contactList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url,host,pass);
             PreparedStatement ps =conn.prepareStatement(query))
        {
            rs=ps.executeQuery();
            while (rs.next())
            {
                found=true;
                contactList.add(new contact(rs.getString(1),rs.getLong(2),rs.getString(3)));
            }
            rs.close();
            System.out.println(contactList);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
