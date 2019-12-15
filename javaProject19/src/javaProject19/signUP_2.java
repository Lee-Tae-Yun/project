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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class signUP_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JLabel label_4;
	private JTextField textField_5;
	private JLabel label_5;
	private JTextField textField_6;
	private JLabel label_6;
	private JTextField textField_7;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	
	String nnul;


	static String url, driver;
	static Connection conn;
	
	public signUP_2() {
		
		dbConnect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("�̸�");
		lblNewLabel.setBounds(27, 39, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(96, 36, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(96, 64, 116, 21);
		contentPane.add(textField_1);
		
		JLabel label = new JLabel("����");
		label.setBounds(27, 67, 57, 15);
		contentPane.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(96, 95, 116, 21);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel("�޴���ȭ");
		label_1.setBounds(27, 98, 57, 15);
		contentPane.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(96, 126, 116, 21);
		contentPane.add(textField_3);
		
		JLabel label_2 = new JLabel("����ȭ");
		label_2.setBounds(27, 129, 57, 15);
		contentPane.add(label_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(306, 36, 116, 21);
		contentPane.add(textField_4);
		
		JLabel label_3 = new JLabel("�ּ�");
		label_3.setBounds(237, 39, 57, 15);
		contentPane.add(label_3);
		
		btnNewButton = new JButton("ȸ������ �Ϸ�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		               if (e.getSource().equals(btnNewButton)) {
		                  BasePstmt = conn.prepareStatement("select * from menber where id = ?");
		                      BasePstmt.setString(1, textField_5.getText());
		                      ResultSet BaseRs = BasePstmt.executeQuery(); // �о���°Ŷ� �ٸ��� ����//����Ÿ���� ResultSet
		                      if (BaseRs.next() == true) { // �̹� id�� �����Ѵٸ�
		                    	  JOptionPane.showMessageDialog(null, "���̵� üũ�ϼ���");
		                      } 
		                      else if ((textField.getText().isEmpty()) == true || (textField_1.getText().isEmpty()) == true
		                              || (textField_2.getText().isEmpty()) == true || (textField_3.getText().isEmpty()) == true
		                              || (textField_4.getText().isEmpty()) == true || (textField_5.getText().isEmpty()) == true
		                    	  	  || (textField_6.getText().isEmpty()) == true|| (textField_7.getText().isEmpty()) == true){//��ĭ�� �������
		                    	  JOptionPane.showMessageDialog(null, "��ĭ�� �ֽ��ϴ�.");
		                      }
		                      else {
		                         BasePstmt = conn.prepareStatement("insert into menber values (?,?,?,?,?,?,?,?,?)");
		                         BasePstmt.setString(1, nnul);
		                         BasePstmt.setString(2, textField.getText());
		                         BasePstmt.setString(3,	textField_1.getText());
		                         BasePstmt.setString(4, textField_2.getText());
		                         BasePstmt.setString(5,	textField_3.getText());
		                         BasePstmt.setString(6, textField_4.getText());
		                         BasePstmt.setString(7, textField_5.getText());
		                         BasePstmt.setString(8, textField_6.getText());
		                         BasePstmt.setString(9, textField_7.getText());
		                         BasePstmt.executeUpdate();
		                  
		                         login_1 p3 = new login_1();
		                         p3.setVisible(true);
		                          dispose(); // â �ݱ�
		                      }
		               }
		            } catch (Exception e2) {
		            	JOptionPane.showMessageDialog(null, "�ߺ��� ������ �ֽ��ϴ�.");
		            }
				
//				main_3 p3 = new main_3();
//				p3.setVisible(true);
//				dispose();
				
			}
		});
	
		btnNewButton.setBounds(77, 210, 116, 23);
		contentPane.add(btnNewButton);
		
		label_4 = new JLabel("ID");
		label_4.setBounds(237, 67, 57, 15);
		contentPane.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(306, 64, 116, 21);
		contentPane.add(textField_5);
		
		label_5 = new JLabel("PW");
		label_5.setBounds(237, 98, 57, 15);
		contentPane.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(306, 95, 116, 21);
		contentPane.add(textField_6);
		
		label_6 = new JLabel("�г���");
		label_6.setBounds(237, 129, 57, 15);
		contentPane.add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(306, 126, 116, 21);
		contentPane.add(textField_7);
		
		button = new JButton("���ư���");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_1 p3 = new login_1();
				p3.setVisible(true);
				dispose();
			}
		});
		button.setBounds(237, 210, 138, 23);
		contentPane.add(button);
		
		button_1 = new JButton("ID�ߺ� üũ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (arg0.getSource().equals(button_1)) {
	                   try {
	                      BasePstmt = conn.prepareStatement("select * from menber where id =? ");
	                      BasePstmt.setString(1, textField_5.getText());
	                      ResultSet BaseRs = BasePstmt.executeQuery();
	                  if (BaseRs.next() == true || (textField_5.getText().isEmpty()) == true) { // �̹� id�� �����Ѵٸ�
	                     JOptionPane.showMessageDialog(null, "�ش� ID�� ����� �Ұ����մϴ�.");
	                  } else {
	                	 JOptionPane.showMessageDialog(null, "�ش� ID�� ����� �����մϴ�.");
	                  }
	               } catch (SQLException e1) {
	                  e1.printStackTrace();
	               }
	               }
			}
		});
		button_1.setBounds(77, 177, 116, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("�г��� �ߺ�üũ");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(button_2)) {
	                   try {
	                      BasePstmt = conn.prepareStatement("select * from menber where nickname =? ");
	                      BasePstmt.setString(1, textField_7.getText());
	                      ResultSet BaseRs = BasePstmt.executeQuery();
	                  if (BaseRs.next() == true || (textField_7.getText().isEmpty()) == true) { // �̹� �г����� �����Ѵٸ�
	                     JOptionPane.showMessageDialog(null, "�ش� �г���������� �Ұ����մϴ�.");
	                  } else {
	                	 JOptionPane.showMessageDialog(null, "�ش� �г����� ����� �����մϴ�.");
	                  }
	               } catch (SQLException e1) {
	                  e1.printStackTrace();
	               }
	               }
				
			}
		});
		button_2.setBounds(237, 177, 138, 23);
		contentPane.add(button_2);
	}
	private static PreparedStatement BasePstmt = null;
	public static void dbConnect() {
   	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
   	try{
   		Class.forName("com.mysql.jdbc.Driver");
   		System.out.println("����̹� �˻� ����!");
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
           System.out.println(BaseRs.getString("ID"));
			}
       }
       catch(Exception e) {
           System.out.println("�����ͺ��̽� ���� ����!");
           e.printStackTrace();
       }
	}
}
