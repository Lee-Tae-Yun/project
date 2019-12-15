package javaProject19;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddWord_10 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	
	
	String nnul;


	static String url, driver;
	static Connection conn;

	public AddWord_10() {
		
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("단어추가");
		lblNewLabel.setBounds(170, 33, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField("");
		textField.setBounds(140, 96, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("추가신청");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
		                         BasePstmt = conn.prepareStatement("insert into aword values (?,?)");
		                         BasePstmt.setString(1, nnul);
		                         BasePstmt.setString(2, textField.getText());

		                         BasePstmt.executeUpdate();
		                  
		                         JOptionPane.showMessageDialog(null, "신청완료이 되었습니다.");
		                     
		               }
		             catch (Exception e2)
		            {
		            	
		            }
				
		}
		});
		button.setBounds(88, 188, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("돌아가기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(215, 188, 97, 23);
		contentPane.add(button_1);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD94\uAC00 \uD560 \uB2E8\uC5B4");
		lblNewLabel_1.setBounds(52, 99, 76, 15);
		contentPane.add(lblNewLabel_1);
		
	}
	private static PreparedStatement BasePstmt = null;
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
           BasePstmt = ((Connection) conn).prepareStatement("select * from aword");
			ResultSet BaseRs = BasePstmt.executeQuery();
			while(BaseRs.next()){	
           System.out.println(BaseRs.getString("add"));
			}
       }
       catch(Exception e) {
           System.out.println("데이터베이스 연결 실패!");
           e.printStackTrace();
       }
	}
}
