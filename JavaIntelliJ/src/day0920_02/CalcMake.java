package day0920_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcMake {
    JFrame f;
    JLabel label;
    JButton l1; JButton l2; JButton l3; JButton l4; JButton l5; JButton l6; JButton l7; JButton l8; JButton l9; JButton l0;
    JButton lAdd; JButton lSub; JButton lPow; JButton lDiv; JButton lEquls; JButton lCansel;
    String num1,num2;
    public CalcMake(){
        f = new JFrame("계산기");

        //종료(EXIT_ON_CLOSE를 사용, 없으면 작업 프로세스에 남아서 메모리 차지)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("0", JLabel.RIGHT);
        label.setEnabled(false);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Serif",Font.BOLD,50));
        label.setOpaque(true);

        l1 = new JButton("1"); l1.setBounds(10,390,55,55);
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        l1.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l2 = new JButton("2"); l2.setBounds(80,390,55,55);
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        l2.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l3 = new JButton("3"); l3.setBounds(150,390,55,55);
        l3.setBackground(Color.black);
        l3.setForeground(Color.white);
        l3.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l0 = new JButton("0"); l0.setBounds(220,390,55,55);
        l0.setBackground(Color.gray);
        l0.setForeground(Color.white);
        l0.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l4 = new JButton("4"); l4.setBounds(10,310,55,55);
        l4.setBackground(Color.black);
        l4.setForeground(Color.white);
        l4.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l5 = new JButton("5"); l5.setBounds(80, 310,55,55);
        l5.setBackground(Color.black);
        l5.setForeground(Color.white);
        l5.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l6 = new JButton("6"); l6.setBounds(150,310,55,55);
        l6.setBackground(Color.black);
        l6.setForeground(Color.white);
        l6.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lSub = new JButton("-"); lSub.setBounds(220,310,55,55);
        lSub.setBackground(Color.gray);
        lSub.setForeground(Color.white);
        lSub.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l7 = new JButton("7"); l7.setBounds(10,230,55,55);
        l7.setBackground(Color.black);
        l7.setForeground(Color.white);
        l7.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l8 = new JButton("8"); l8.setBounds(80, 230,55,55);
        l8.setBackground(Color.black);
        l8.setForeground(Color.white);
        l8.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l9 = new JButton("9"); l9.setBounds(150,230,55,55);
        l9.setBackground(Color.black);
        l9.setForeground(Color.white);
        l9.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lAdd = new JButton("+"); lAdd.setBounds(220,230,55,55);
        lAdd.setBackground(Color.gray);
        lAdd.setForeground(Color.white);
        lAdd.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lCansel = new JButton("C"); lCansel.setBounds(10,150,55,55);
        lCansel.setBackground(Color.red);
        lCansel.setForeground(Color.white);
        lCansel.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lDiv = new JButton("÷"); lDiv.setBounds(80,150,55,55);
        lDiv.setBackground(Color.gray);
        lDiv.setForeground(Color.white);
        lDiv.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lPow = new JButton("×"); lPow.setBounds(150,150,55,55);
        lPow.setBackground(Color.gray);
        lPow.setForeground(Color.white);
        lPow.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lEquls = new JButton("="); lEquls.setBounds(220,150,55,55);
        lEquls.setBackground(Color.gray);
        lEquls.setForeground(Color.white);
        lEquls.setFont(new Font("맑은 고딕",Font.BOLD,25));


        label.setBounds(10,10,265,100);

        f.add(label);
        f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(l7); f.add(l8); f.add(l9); f.add(l0);
        f.add(lAdd); f.add(lSub); f.add(lCansel); f.add(lDiv); f.add(lPow); f.add(lEquls);

        f.setSize(300, 500);
        f.setLayout(null);
        f.setVisible(true);

        l1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("1");
            }
        });
        l2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("2");
            }
        });
        l3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("3");
            }
        });
        l4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("4");
            }
        });
        l5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("5");
            }
        });
        l6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("6");
            }
        });
        l7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("7");
            }
        });
        l8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("8");
            }
        });
        l9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("9");
            }
        });
        l0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("0");
            }
        });
        lAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("+");
            }
        });
        lSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("-");
            }
        });
        lPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("×");
            }
        });
        lDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("÷");
            }
        });
        lEquls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = 0;

                label.setText(String.valueOf(result));
            }
        });
        lCansel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new CalcMake();
    }
}
