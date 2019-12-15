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

public class DeleteWord_12 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	String nnul;


	static String url, driver;
	static Connection conn;
	
	public DeleteWord_12() {
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("단어삭제");
		label.setBounds(180, 31, 57, 15);
		contentPane.add(label);
		
		textField = new JTextField("");
		textField.setColumns(10);
		textField.setBounds(150, 86, 125, 21);
		contentPane.add(textField);
		
		textField_1 = new JTextField("");
		textField_1.setColumns(10);
		textField_1.setBounds(150, 118, 125, 21);
		contentPane.add(textField_1);
		
		JButton button_1 = new JButton("삭제신청");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    BasePstmt = conn.prepareStatement("insert into dword values (?,?,?)");
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
		button_1.setBounds(98, 186, 97, 23);
		contentPane.add(button_1);

		JButton button = new JButton("돌아가기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(225, 186, 97, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("\uC0AD\uC81C \uB2E8\uC5B4");
		lblNewLabel.setBounds(77, 89, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\uC774\uC720");
		label_1.setBounds(77, 121, 57, 15);
		contentPane.add(label_1);
		
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
           BasePstmt = ((Connection) conn).prepareStatement("select * from dword");
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
