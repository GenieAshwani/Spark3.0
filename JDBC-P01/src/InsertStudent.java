import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/spark";
        String username="root";
        String password="root";

        String insertQuery="insert into students(name,age,course) values (?,?,?)";

        try {
            Connection con= DriverManager.getConnection(url,username,password);
            //create statement
            PreparedStatement pr =con.prepareStatement(insertQuery);
            //1
            pr.setString(1,"prem");
            pr.setInt(2,11);
            pr.setString(3,"JFS");
            pr.executeUpdate();

            pr.setString(1,"Vinay");
            pr.setInt(2,44);
            pr.setString(3,"DSA");

            pr.executeUpdate();

            System.out.println("data inserted....");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
