package day0920_01;

import javax.swing.*;

public class SwingComboBox01 {

	JFrame f;
	JComboBox<String> cbName;

	public SwingComboBox01() {
		f = new JFrame("콤보박스 예제");

		String[] name = {"홍길동","고길동","김길동"};
		cbName = new JComboBox<String>(name);
		cbName.setBounds(30,20,80,30);

		f.add(cbName);

		f.setLocation(820,290);
		f.setSize(300, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingComboBox01();
	}

}
