package javaProject19;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

import javax.swing.JButton;

public class asd {

	static String url, driver;
	static Connection conn;
		public static void main(String[] args) {
			dbConnect();
		}
	private static PreparedStatement BasePstmt = null;
	   private JButton btnNewButton;
		public static void dbConnect() {
	   	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
	   	try{
	   		Class.forName("com.mysql.jdbc.Driver");
	   		System.out.println("드라이버 검색 성공!");
	   	}catch(ClassNotFoundException e){
	   		System.err.println("error = " + e);
	   	}
	   	
	   	url = "jdbc:mysql://localhost/hunmin_19?useUnicode=yes&characterEncoding=UTF8" + "";
	       conn = null;
	   
	       
			try {		
	           conn = DriverManager.getConnection(url,"root","apmsetup"); 
	           BasePstmt = conn.prepareStatement("select * from menber");
				ResultSet BaseRs = BasePstmt.executeQuery();
				while(BaseRs.next()){	
	           System.out.println(BaseRs.getString("ID"));
				}
	       }
	       catch(Exception e) {
	           System.out.println("데이터베이스 연결 실패!");
	           e.printStackTrace();
	       }
		}
	
}

