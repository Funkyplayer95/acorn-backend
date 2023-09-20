package day0920_01;

import javax.swing.*;

public class SwingTextArea01 {

	JFrame f;
	JTextArea taValue;

	public SwingTextArea01() {
		f = new JFrame("Test Form Example");

		taValue = new JTextArea("TextArea");
		taValue.setBounds(10,20,300,200);

		f.add(taValue);

		f.setSize(500, 350);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingTextArea01();
	}

}
