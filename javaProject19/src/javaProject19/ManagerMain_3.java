package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerMain_3 extends JFrame {

	private JPanel contentPane;

	public ManagerMain_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("����");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("�α׾ƿ�");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerLogin_1 p1 = new ManagerLogin_1();
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(menuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("ȸ������");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem = new JMenuItem("ȸ�� ��ȸ");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberLookUP_13 p1 = new MemberLookUP_13();
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_1.add(menuItem);
		
		JMenu mnNewMenu_2 = new JMenu("�ܾ����");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("�ܾ��߰� ��ȸ");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddWordLookup_15 p1 = new AddWordLookup_15();
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("�ܾ���� ��ȸ");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WordCorrectionLookup_16 p1 = new WordCorrectionLookup_16();
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("�ܾ���� ��ȸ");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteWordLookup_17 p1 = new DeleteWordLookup_17();
				p1.setVisible(true);
				dispose();
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("�ܾ� �߰�");
		button.setBounds(62, 35, 293, 44);
		contentPane.add(button);
		
		JButton button_1 = new JButton("�ܾ� ����");
		button_1.setBounds(62, 89, 293, 44);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("�ܾ� ����");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(62, 143, 293, 44);
		contentPane.add(button_2);
	}

}
