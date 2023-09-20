package day0920_01;

import javax.swing.*;

public class SwingTextField01 {

	JFrame f; JLabel lblFirstName; JLabel lblMiddleName; JLabel lblLastName; JLabel lblAge;

	JTextField tflFirstName; JTextField tflMiddleName; JTextField tflLastName; JTextField tflAge;

	JButton btnClick;

	public SwingTextField01() {
		f = new JFrame("Test Label");

		lblFirstName = new JLabel("First Name"); lblFirstName.setBounds(50, 30, 80, 50);
		tflFirstName = new JTextField(); tflFirstName.setBounds(150,40,200,30);

		lblMiddleName = new JLabel("Middle Name"); lblMiddleName.setBounds(50, 90, 80, 50);
		tflMiddleName = new JTextField(); tflMiddleName.setBounds(150,100,200,30);

		lblLastName = new JLabel("Last Name"); lblLastName.setBounds(50, 150, 80, 50);
		tflLastName = new JTextField(); tflLastName.setBounds(150,160,200,30);

		lblAge = new JLabel("Age"); lblAge.setBounds(50, 210, 80, 50);
		tflAge = new JTextField(); tflAge.setBounds(150,220,80,30);

		btnClick = new JButton("확인");
		btnClick.setBounds(150,280,60,30);

		f.add(lblFirstName); f.add(lblMiddleName); f.add(lblLastName); f.add(lblAge);
		f.add(tflFirstName); f.add(tflMiddleName); f.add(tflLastName); f.add(tflAge);
		f.add(btnClick);

		
		f.setSize(500, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingTextField01();
	}

}
