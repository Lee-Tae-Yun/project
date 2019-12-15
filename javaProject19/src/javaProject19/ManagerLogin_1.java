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

public class ManagerLogin_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	static String url, driver;
	static Connection conn;
	public static String id;
	
	public ManagerLogin_1() {
		
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setBounds(115, 70, 57, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(158, 66, 116, 21);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("PW");
		label_1.setBounds(115, 99, 57, 15);
		contentPane.add(label_1);
		
		JButton button = new JButton("관리자 로그인");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(button)) {
                    try {
                       BasePstmt = conn.prepareStatement("select * from administer where id = ?");
                       BasePstmt.setString(1, textField.getText());
                     ResultSet BaseRs = BasePstmt.executeQuery();
                   if (BaseRs.next() == false || (textField.getText().isEmpty()) == true) { // id가 없거나, 공란일때 실행안됨
                	   JOptionPane.showMessageDialog(null, "ID,PW를 체크하세요");
                   } else {
                      BasePstmt = conn.prepareStatement("select * from administer where id = ?");
                          BasePstmt.setString(1, textField.getText());
                        BaseRs = BasePstmt.executeQuery();
                          while (BaseRs.next() == true) {
                             char[] secret_pw = passwordField.getPassword();
                             String pw = "";
                             for(char cha : secret_pw){
                                Character.toString(cha);
                                pw += (pw.equals("")) ? ""+cha+"" : ""+cha+"";
                             }
                              if (BaseRs.getString("pw").equals(pw)) { // pw와 같은지 비교
                            	  MyInfo_4.id = textField.getText();
                            	  ManagerMain_3 p1 = new ManagerMain_3();
                            	  p1.setVisible(true);
                            	  dispose();
                              } else {                // 아이디는같고 pw가 다른경우
                            	  JOptionPane.showMessageDialog(null, "PW를 체크하세요");
                              }
                          }
                   }
                } catch (SQLException e1) {
                   e1.printStackTrace();
                }
             }
				
			}
		});
		button.setBounds(81, 140, 116, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("관리자 회원가입");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerSignUP_2 p1 = new ManagerSignUP_2();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(209, 140, 138, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("돌아가기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start_0 p1 = new Start_0();
				p1.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(245, 209, 97, 23);
		contentPane.add(button_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 95, 116, 21);
		contentPane.add(passwordField);
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
