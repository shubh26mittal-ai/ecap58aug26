package excelr.com.DynamicRetrieve;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException,SQLException
    {
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web85Newbatch","root","shubhmittal");
       Scanner sc=new Scanner(System.in);
       System.out.println("enter student id:");
       int sno = sc.nextInt();
       String q = "select * from student where sno=?";
       PreparedStatement ps = con.prepareStatement(q);
       ps.setInt(1, sno);
       ResultSet rs = ps.executeQuery();
       while(rs.next())
       {
    	   for(int i=1;i<3;i++)
    	   {
    		   System.out.println(rs.getString(i)+"\t");
    	   }
    	   System.out.println();
       }
       con.close();
    }
}
