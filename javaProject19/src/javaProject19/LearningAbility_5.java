package javaProject19;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LearningAbility_5 extends JFrame {

	private JPanel contentPane;

	public LearningAbility_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("(ȸ�� �̸�)�� �н�����");
		label.setBounds(37, 30, 143, 26);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("�н��� �ܾ��� ����");
		lblNewLabel.setBounds(64, 94, 137, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("���ܾ��� ����(COUNT)");
		lblNewLabel_1.setBounds(213, 94, 143, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("�н��ؾ��� �ܾ��� ����");
		label_1.setBounds(64, 147, 137, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("�����Ʈ(COUNT)");
		label_2.setBounds(213, 147, 143, 15);
		contentPane.add(label_2);
		
		JButton button = new JButton("�����Ʈ �ϱ�");
		button.setBounds(81, 205, 120, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("���ư���");
		button_1.setBounds(217, 205, 97, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main_3 p1 = new main_3() ;
				p1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(button_1);
	}

}
