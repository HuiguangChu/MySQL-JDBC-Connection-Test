package TEST;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


public class Jdbc {

	public static void main (String args[])  {
		
		// TODO Auto-generated method stub
		// driver
		   String driver = "com.mysql.jdbc.Driver";
		// URL direction :hostname +databasename"huiguang"
		String url = "jdbc:mysql://mysql.stud.hig.no/s120556";
		// MySQL username
		String user = "s120556";
		// Java to MySQL password
		String password = "k72ZvQtY";
		try{
		// loading driver
		Class.forName(driver).newInstance();
		// connecting to the database
		Connection conn = DriverManager.getConnection(url, user, password);
		if(!conn.isClosed())
		System.out.println("Succeeded connecting to the Database!");
		// statement is used for executing SQL commmand
		Statement statement = conn.createStatement();
		// SQL command 
		String cname="s123";
		String sql = "select age from huiguang where name='"+cname+"'";
		ResultSet rs = statement.executeQuery(sql);//返回的是一张数据表的所有的行跟列
		//return the row by the augument(int i)
		//rs.absolute(3);
	//return the value in certain colum and row (rs.getString(int columIndex)
			//Info = rs.getString(1);
		while (rs.next()){
		
			System.out.println(rs.getString(1));
			//System.out.println(rs.absolute(1));
		}
			rs.close(); 
	conn.close();
	}catch(Exception e){
		System.out.println("shit");
	}

		
	
		 Date date= new Date();
		 System.out.println(date);
		
	}

	

	



}

