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

public class CorrectionWord_11 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	String nnul;


	static String url, driver;
	static Connection conn;
	
	public CorrectionWord_11() {
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("단어 수정");
		label.setBounds(182, 38, 57, 15);
		contentPane.add(label);
		
		textField = new JTextField("");
		textField.setColumns(10);
		textField.setBounds(152, 93, 116, 21);
		contentPane.add(textField);
		
		textField_1 = new JTextField("");
		textField_1.setColumns(10);
		textField_1.setBounds(152, 125, 116, 21);
		contentPane.add(textField_1);
		
		JButton button = new JButton("수정신청");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    BasePstmt = conn.prepareStatement("insert into cword values (?,?,?)");
                    BasePstmt.setString(1, nnul);
                    BasePstmt.setString(2, textField.getText());
                    BasePstmt.setString(3, textField_1.getText());
                    BasePstmt.executeUpdate();
             
                    JOptionPane.showMessageDialog(null, "신청완료이 되었습니다.");
                
          }
        catch (Exception e2)
       {
       	
       }
			}
		});
		button.setBounds(100, 193, 97, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("돌아가기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button_1.setBounds(227, 193, 97, 23);
		contentPane.add(button_1);
		
		JLabel label_1 = new JLabel("\uC218\uC815 \uC804 \uB2E8\uC5B4");
		label_1.setBounds(63, 96, 77, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC218\uC815 \uD6C4 \uB2E8\uC5B4");
		label_2.setBounds(63, 128, 77, 15);
		contentPane.add(label_2);

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
           BasePstmt = ((Connection) conn).prepareStatement("select * from cword");
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
