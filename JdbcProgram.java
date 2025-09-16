package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProgram {
	
	public static void main(String[] args) {
		
		String jdbcurl = "jdbc:mysql://localhost:3308/springdb";
		String username = "root";
		String password = "java";
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
			
			System.out.print("Enter Your id");
			int id = sc.nextInt();
			
			System.out.print("Enter Your Name");
			String name = sc.next();
			
			String quary = "INSERT INTO sqldata (id,name) VALUES (?,?) ";
			
		    PreparedStatement pstate = con.prepareStatement(quary);
			pstate.setInt(1, id);
			pstate.setString(2, name);
			
			
			pstate.executeUpdate();
			
			
			Statement stmt = con.createStatement();
			
			String sql = "SELECT id,name FROM sqldata";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int User_ID = rs.getInt("id");
				String User_Name = rs.getString("name");
				System.out.println("User_ID : "+User_ID+" "+"User_Name :"+User_Name);
			}
			
			rs.close();
			stmt.close();
			con.close();
			System.out.println("Connection Close Succsfully");
			
		}
		catch (Exception e) {
			System.out.println("Somting went wrong ");
			e.printStackTrace();
		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter The Name You Want To Insert");
//	//	System.out.println(sc.next());
//		String name = sc.next();
//		System.out.println("Your Name is "+name);
		
		
	}

}
