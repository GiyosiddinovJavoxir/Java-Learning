import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver"); // <1>
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/database_name", "user_name", "user_password"); // <2>

            Statement statement = (Statement) con.createStatement(); // <3>
            ResultSet rs = ((java.sql.Statement) statement).executeQuery("select * from student"); // <4>
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " -  " + rs.getString("name"));
            }
            con.close(); // <5>
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}