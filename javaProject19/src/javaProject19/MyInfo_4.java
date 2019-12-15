package javaProject19;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static javaProject19.login_1.id;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class MyInfo_4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton button_1;
	private JTextField textField_5;
	private JLabel label_6;
	private JTextField textField_6;

	static String url, driver;
	static Connection conn;
	
	public static String id;
	
	String name;
    String age;
    String tel;
    String htel;
    String add;
    String nn;
	
	public MyInfo_4() {
		dbConnect();
		
		try {
			PreparedStatement pstmtFee = conn.prepareStatement("select * from menber where id = ?");
				pstmtFee.setString(1, id);
	           ResultSet BaseRs = pstmtFee.executeQuery();
	           while(BaseRs.next()){
	        	   name = BaseRs.getString(2);
	               age = BaseRs.getString(3);
	               tel = BaseRs.getString(4);
	               htel = BaseRs.getString(5);
	               add = BaseRs.getString(6);
	               nn = BaseRs.getString(9);
	           }
	           
	           BaseRs.close();
	           pstmtFee.close();
		}
	    catch (Exception e) {
			// TODO: handle exception
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("이름");
		label.setBounds(117, 13, 57, 15);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(186, 10, 116, 21);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("나이");
		label_1.setBounds(117, 41, 57, 15);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(186, 38, 116, 21);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("휴대전화");
		label_2.setBounds(117, 72, 57, 15);
		contentPane.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(186, 69, 116, 21);
		contentPane.add(textField_2);
		
		JLabel label_3 = new JLabel("집전화");
		label_3.setBounds(117, 103, 57, 15);
		contentPane.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(186, 100, 116, 21);
		contentPane.add(textField_3);
		
		JLabel label_4 = new JLabel("주소");
		label_4.setBounds(117, 134, 57, 15);
		contentPane.add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(186, 131, 116, 21);
		contentPane.add(textField_4);
		
		button_1 = new JButton("돌아가기");
		button_1.setBounds(183, 228, 97, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3() ;
				p1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(button_1);
		
		JLabel label_5 = new JLabel("닉네임");
		label_5.setBounds(117, 165, 57, 15);
		contentPane.add(label_5);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(186, 162, 116, 21);
		contentPane.add(textField_5);
		
		label_6 = new JLabel("레벨");
		label_6.setBounds(117, 193, 57, 15);
		contentPane.add(label_6);

		textField_6 = new JTextField("1");
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(186, 190, 116, 21);
		contentPane.add(textField_6);
		
		textField.setText(name);
        textField_1.setText(age);
        textField_2.setText(tel);
        textField_3.setText(htel);
        textField_4.setText(add);
        textField_5.setText(nn);
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
           BasePstmt = ((Connection) conn).prepareStatement("select * from menber");
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
