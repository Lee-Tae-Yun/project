package javaProject19;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class main_3 extends JFrame {

	private JPanel contentPane;
	
	public main_3() {


		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("����");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("������");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyInfo_4 p1 = new MyInfo_4() ;
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("�н���Ȳ");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LearningAbility_5 p1 = new LearningAbility_5() ;
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("�α׾ƿ�");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_1 p1 = new login_1() ;
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("�ܾ�");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("�ܾ� �߰�");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddWord_10 p1 = new AddWord_10();
				p1.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("�ܾ� ����");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CorrectionWord_11 p1 = new CorrectionWord_11();
				p1.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("�ܾ� ����");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteWord_12 p1 = new DeleteWord_12();
				p1.setVisible(true);
				dispose();
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("�н��ϱ�");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Learning_6 p1 = new Learning_6();
				p1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(58, 40, 129, 161);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("�׽�Ʈ�ϱ�");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_7 p1 = new Test_7();
				p1.setVisible(true);
				dispose();
			}
		});
		button.setBounds(234, 40, 129, 161);
		contentPane.add(button);
	}

	
}
