package javaProject19;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ManagerSignUP_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton;
	private JButton button;

	String nnul, An;


	static String url, driver;
	static Connection conn;
	public ManagerSignUP_2() {
		
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("관리자 코드");
		label.setBounds(94, 58, 70, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(176, 55, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("관리자 ID");
		label_1.setBounds(94, 92, 70, 15);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 89, 116, 21);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("관리자 PW");
		label_2.setBounds(94, 123, 70, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(176, 120, 116, 21);
		contentPane.add(textField_2);
		
		btnNewButton = new JButton("관리자 등록");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
	               if (e.getSource().equals(btnNewButton)) {
	            	   String An = textField.getText();
		                  BasePstmt = conn.prepareStatement("select * from administer where id = ?");
		                      BasePstmt.setString(1, textField_1.getText());
		                      ResultSet BaseRs = BasePstmt.executeQuery(); // 읽어오는거라 다르다 비교해//리턴타입이 ResultSet
		                      if (BaseRs.next() == true) { // 이미 id가 존재한다면
		                    	  JOptionPane.showMessageDialog(null, "아이디를 체크하세요");
		                      } 
		                      else if ((textField.getText().isEmpty() == true || textField_1.getText().isEmpty()) == true || (textField_2.getText().isEmpty()) == true ){//빈칸이 있을경우
		                    	  JOptionPane.showMessageDialog(null, "빈칸이 있습니다.");
		                      }
		                      
		                      else if(An.equals("123")) {
		                         BasePstmt = conn.prepareStatement("insert into administer values (?,?,?)");
		                         BasePstmt.setString(1, nnul);
		                         BasePstmt.setString(2, textField_1.getText());
		                         BasePstmt.setString(3,	textField_2.getText());
		                         BasePstmt.executeUpdate();
		                  
		                         ManagerLogin_1 p3 = new ManagerLogin_1();
		                         p3.setVisible(true);
		                          dispose(); // 창 닫기
		                      }
		                      else {
		                    	  JOptionPane.showMessageDialog(null, "관리자 코드가 정확하지 않습니다.");
		                      }
		               }
		            } catch (Exception e2) {
		            	JOptionPane.showMessageDialog(null, "중복된 내용이 있습니다.");
		            }
//				ManagerLogin_1 p1 = new ManagerLogin_1();
//				p1.setVisible(true);
//				dispose();
			}
		});
		btnNewButton.setBounds(94, 194, 109, 23);
		contentPane.add(btnNewButton);
		
		button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogin_1 p1 = new ManagerLogin_1();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(215, 194, 97, 23);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("ID\uC911\uBCF5\uCCB4\uD06C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource().equals(btnNewButton_1)) {
	                   try {
	                      BasePstmt = conn.prepareStatement("select * from administer where id =? ");
	                      BasePstmt.setString(1, textField_1.getText());
	                      ResultSet BaseRs = BasePstmt.executeQuery();
	                  if (BaseRs.next() == true || (textField_1.getText().isEmpty()) == true) { // 이미 id가 존재한다면
	                     JOptionPane.showMessageDialog(null, "해당 ID는 사용이 불가능합니다.");
	                  } else {
	                	 JOptionPane.showMessageDialog(null, "해당 ID는 사용이 가능합니다.");
	                  }
	               } catch (SQLException e1) {
	                  e1.printStackTrace();
	               }
	               }
			}
		});
		btnNewButton_1.setBounds(94, 161, 109, 23);
		contentPane.add(btnNewButton_1);
	}
	private static PreparedStatement BasePstmt = null;
	private JPasswordField passwordField;

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
	           BasePstmt = ((Connection) conn).prepareStatement("select * from administer");
				ResultSet BaseRs = BasePstmt.executeQuery();
				while(BaseRs.next()){	
	          
				}
	       }
	       catch(Exception e) {
	           System.out.println("데이터베이스 연결 실패!");
	           e.printStackTrace();
	       }
		}
}
