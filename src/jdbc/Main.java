package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//connection creation
	Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
	
	System.out.println("connection created");
	//2.Create statement
	Statement mystmt=(Statement) mycon.createStatement();
	//Query execute
	ResultSet rs=mystmt.executeQuery("SELECT * FROM employee");
	while(rs.next())
	{
	System.out.println(rs.getNString("empname")+""+rs.getNString("emprole"));
		
	}
}
catch(Exception e)
{
	e.printStackTrace();}
	}

}
