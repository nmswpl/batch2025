package in.co.nmsworks.week3.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

    public class TraineeDbWriter implements Writer {

        private Connection conn;
        private PreparedStatement ps;

        @Override
        public void open() {
            try {
                String sqlQuery = "insert into trainee(id,name,department)values(?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "nms-training", "nms-training");
                ps = conn.prepareStatement(sqlQuery);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void write(List<Trainee> listOfTrainee) throws SQLException {
            for (Trainee trainee : listOfTrainee) {
                int id = trainee.getId();
                String name = trainee.getName();
                String department = trainee.getDepartment();
                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, department);
            }
            ps.executeUpdate();
        }

        @Override
        public void close() {

            try {
                conn.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

