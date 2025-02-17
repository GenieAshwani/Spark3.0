import java.sql.*;

public class FetchStudent {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/spark";
        String username="root";
        String password="root";

        String query="select * from students";
        try {

            //1. load kro
            //Class.forName("com.mysql.cj.jdbc.Driver");
            //2 connection bana rahe ha
            Connection con=DriverManager.getConnection(url,username,password);
            //create statement
            Statement stmt=con.createStatement();
            //execute
            ResultSet rs = stmt.executeQuery(query);

            //get result
            System.out.println("Id | Name | Age | Course");
            System.out.println("----------------------------------");
            while (rs.next())
            {
                System.out.println(rs.getInt("id")+ " | "+
                                   rs.getString("name")+ " | "+
                                   rs.getInt("age")+" | "+
                                   rs.getString("course")+ " | " );
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
