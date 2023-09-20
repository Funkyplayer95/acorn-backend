package day0920_01;

import javax.swing.*;

public class SwingList01 {

	JFrame f;
	JList<String> lList;

	public SwingList01() {
		f = new JFrame("리스트 예제");

		DefaultListModel<String> dlm = new DefaultListModel<String>();
		dlm.addElement("item1");
		dlm.addElement("item2");
		dlm.addElement("item3");
		dlm.addElement("item4");

		lList = new JList<String>(dlm);
		lList.setBounds(100,30,100,80);

		f.add(lList);


		f.setLocation(820,290);
		f.setSize(300, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SwingList01();
	}

}
