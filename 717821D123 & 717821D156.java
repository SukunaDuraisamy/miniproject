package JAVAProject;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "root";
        try{
            Scanner sc = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from CollegeEnrollment");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getString(2)+" "+
                        rs.getString(3)+" "+rs.getInt(4));
            }

        }catch (Exception e){ }
    }
}
