package day0920_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	private JFrame f;
	private JPanel controlPanel;
	
	private JTextField tfResult;
	
	private JButton btnNum00;
	private JButton btnNum01;
	private JButton btnNum02;
	private JButton btnNum03;
	private JButton btnNum04;
	private JButton btnNum05;
	private JButton btnNum06;
	private JButton btnNum07;
	private JButton btnNum08;
	private JButton btnNum09;
	
	private JButton btnOperatoradd;
	private JButton btnOperatorsub;
	private JButton btnOperatormul;
	private JButton btnOperatordiv;
	
	private JButton btnClear;
	private JButton btnCommandRun;
	
	public Calculator() {
		f = new JFrame("계산기");
		f.setSize(300,380);
		f.setLayout(null);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBackground(Color.WHITE);
		tfResult.setForeground(Color.BLACK);
		tfResult.setBounds(8, 10, 270, 40);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(4, 4, 10, 10));
		controlPanel.setBounds(8, 70, 270, 250);
		
		btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		btnOperatordiv = new JButton("/");
		btnOperatordiv.setBackground(Color.GRAY);
		btnOperatordiv.setForeground(Color.WHITE);
		btnOperatormul = new JButton("x");
		btnOperatormul.setBackground(Color.GRAY);
		btnOperatormul.setForeground(Color.WHITE);
		btnCommandRun = new JButton("=");
		btnCommandRun.setBackground(Color.GRAY);
		btnCommandRun.setForeground(Color.WHITE);
		
		btnNum07 = new JButton("7");
		btnNum07.setBackground(Color.BLACK);
		btnNum07.setForeground(Color.WHITE);
		btnNum08 = new JButton("8");
		btnNum08.setBackground(Color.BLACK);
		btnNum08.setForeground(Color.WHITE);
		btnNum09 = new JButton("9");
		btnNum09.setBackground(Color.BLACK);
		btnNum09.setForeground(Color.WHITE);
		btnOperatoradd = new JButton("+");
		btnOperatoradd.setBackground(Color.GRAY);
		btnOperatoradd.setForeground(Color.WHITE);
		
		btnNum04 = new JButton("4");
		btnNum04.setBackground(Color.BLACK);
		btnNum04.setForeground(Color.WHITE);
		btnNum05 = new JButton("5");
		btnNum05.setBackground(Color.BLACK);
		btnNum05.setForeground(Color.WHITE);
		btnNum06 = new JButton("6");
		btnNum06.setBackground(Color.BLACK);
		btnNum06.setForeground(Color.WHITE);
		btnOperatorsub = new JButton("-");
		btnOperatorsub.setBackground(Color.GRAY);
		btnOperatorsub.setForeground(Color.WHITE);
		
		btnNum01 = new JButton("1");
		btnNum01.setBackground(Color.BLACK);
		btnNum01.setForeground(Color.WHITE);
		btnNum02 = new JButton("2");
		btnNum02.setBackground(Color.BLACK);
		btnNum02.setForeground(Color.WHITE);
		btnNum03 = new JButton("3");
		btnNum03.setBackground(Color.BLACK);
		btnNum03.setForeground(Color.WHITE);
		btnNum00 = new JButton("0");
		btnNum00.setBackground(Color.GRAY);
		btnNum00.setForeground(Color.WHITE);
		
		controlPanel.add(btnClear);
		controlPanel.add(btnOperatordiv);
		controlPanel.add(btnOperatormul);
		controlPanel.add(btnCommandRun);
		controlPanel.add(btnNum07);
		controlPanel.add(btnNum08);
		controlPanel.add(btnNum09);
		controlPanel.add(btnOperatoradd);
		controlPanel.add(btnNum04);
		controlPanel.add(btnNum05);
		controlPanel.add(btnNum06);
		controlPanel.add(btnOperatorsub);
		controlPanel.add(btnNum01);
		controlPanel.add(btnNum02);
		controlPanel.add(btnNum03);
		controlPanel.add(btnNum00);
		
		btnNum00.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
					tfResult.setText(tfResult.getText() + "0");
			}
		});
		
		btnNum01.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "1");
			}
		});
		
		btnNum02.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "2");
			}
		});
		
		btnNum03.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "3");
			}
		});
		
		btnNum04.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "4");
			}
		});
		
		btnNum05.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {tfResult.setText(tfResult.getText() + "5"); }
		});
		
		btnNum06.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "6");
			}
		});
		
		btnNum07.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "7");
			}
		});
		
		btnNum08.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "8");
			}
		});
		
		btnNum09.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + "9");
			}
		});
		
		btnOperatoradd.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + " + ");
			}
		});
		
		btnOperatorsub.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + " - ");
			}
		});
		
		btnOperatormul.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + " x ");
			}
		});
		
		btnOperatordiv.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(tfResult.getText() + " / ");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				tfResult.setText("");
			}
		});
		
		btnCommandRun.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				double rRet = calculate(tfResult.getText());
				tfResult.setText(String.valueOf(rRet));
			}
		});
		
		f.add(tfResult);
		f.add(controlPanel);
		f.setResizable(false);
		f.setVisible(true); 
	
	}
	
	public double calculate(String targetStr) {
		double rRet = 0.0;
		String[] tokens = targetStr.split(" ");
		if(tokens.length > 3) {
			tfResult.setText("허용되지 요청입니다.");
		} else {
			if(tokens[1].equals("+")) {
				rRet = Double.valueOf(tokens[0]) + Double.valueOf(tokens[2]);
			} else if(tokens[1].equals("-")) {
				rRet = Double.valueOf(tokens[0]) - Double.valueOf(tokens[2]);
			} else if(tokens[1].equals("x")) {
				rRet = Double.valueOf(tokens[0]) * Double.valueOf(tokens[2]);
			} else if(tokens[1].equals("/")) {
				rRet = Double.valueOf(tokens[0]) / Double.valueOf(tokens[2]);
			} else {
				tfResult.setText("지원하지 않는 연산입니다.");
				rRet = -1.0;
			}
		}
		return rRet;
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
