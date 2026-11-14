package com.excelr.InsertRecordJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web85Newbatch",
        		"root","shubhmittal");
        
        Statement s = con.createStatement();
        
        String q = "insert into student values(105 ,'keerthi',70)";
        
        s.executeUpdate(q);
        System.out.println("inserted record successfully");
        
        con.close();
        
    }
}
