package day0920_02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcMake {
    JFrame f;
    JLabel label;
    JPanel panel;
    JTextField tf;
    JButton l1; JButton l2; JButton l3; JButton l4; JButton l5; JButton l6; JButton l7; JButton l8; JButton l9; JButton l0;
    JButton lAdd; JButton lSub; JButton lPow; JButton lDiv; JButton lEquls; JButton lCansel;
    public CalcMake(){
        f = new JFrame("계산기");

        //종료(EXIT_ON_CLOSE를 사용, 없으면 작업 프로세스에 남아서 메모리 차지)
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("0", JLabel.RIGHT);
        label.setEnabled(false);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Serif",Font.BOLD,50));
        label.setOpaque(true);

        panel= new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBounds(8, 180, 270, 250);

        tf = new JTextField();
        tf.setEditable(false);
        tf.setBackground(Color.WHITE);
        tf.setForeground(Color.BLACK);
        tf.setBounds(8, 10, 270, 120);
        tf.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l1 = new JButton("1");
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        l1.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l2 = new JButton("2");
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        l2.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l3 = new JButton("3");
        l3.setBackground(Color.black);
        l3.setForeground(Color.white);
        l3.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l0 = new JButton("0");
        l0.setBackground(Color.gray);
        l0.setForeground(Color.white);
        l0.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l4 = new JButton("4");
        l4.setBackground(Color.black);
        l4.setForeground(Color.white);
        l4.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l5 = new JButton("5");
        l5.setBackground(Color.black);
        l5.setForeground(Color.white);
        l5.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l6 = new JButton("6");
        l6.setBackground(Color.black);
        l6.setForeground(Color.white);
        l6.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lSub = new JButton("-");
        lSub.setBackground(Color.gray);
        lSub.setForeground(Color.white);
        lSub.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l7 = new JButton("7");
        l7.setBackground(Color.black);
        l7.setForeground(Color.white);
        l7.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l8 = new JButton("8");
        l8.setBackground(Color.black);
        l8.setForeground(Color.white);
        l8.setFont(new Font("맑은 고딕",Font.BOLD,25));

        l9 = new JButton("9");
        l9.setBackground(Color.black);
        l9.setForeground(Color.white);
        l9.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lAdd = new JButton("+");
        lAdd.setBackground(Color.gray);
        lAdd.setForeground(Color.white);
        lAdd.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lCansel = new JButton("C");
        lCansel.setBackground(Color.red);
        lCansel.setForeground(Color.white);
        lCansel.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lDiv = new JButton("÷");
        lDiv.setBackground(Color.gray);
        lDiv.setForeground(Color.white);
        lDiv.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lPow = new JButton("×");
        lPow.setBackground(Color.gray);
        lPow.setForeground(Color.white);
        lPow.setFont(new Font("맑은 고딕",Font.BOLD,25));

        lEquls = new JButton("=");
        lEquls.setBackground(Color.gray);
        lEquls.setForeground(Color.white);
        lEquls.setFont(new Font("맑은 고딕",Font.BOLD,25));


        panel.add(lCansel); panel.add(lDiv); panel.add(lPow); panel.add(lEquls); panel.add(l7); panel.add(l8); panel.add(l9);
        panel.add(lAdd); panel.add(l4); panel.add(l5); panel.add(l6); panel.add(lSub); panel.add(l1); panel.add(l2);
        panel.add(l3); panel.add(l0);

        f.setSize(300, 500);
        f.setLayout(null);
        f.setVisible(true);

        l1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "1");
            }
        });
        l2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "2");
            }
        });
        l3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "3");
            }
        });
        l4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "4");
            }
        });
        l5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "5");
            }
        });
        l6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "6");
            }
        });
        l7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "7");
            }
        });
        l8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "8");
            }
        });
        l9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "9");
            }
        });
        l0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "0");
            }
        });
        lAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "+");
            }
        });
        lSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "-");
            }
        });
        lPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "×");
            }
        });
        lDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(tf.getText() + "÷");
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
                tf.setText("");
            }
        });

        f.add(panel); f.add(tf); f.setResizable(false); f.setVisible(true);
    }

    public static void main(String[] args) {
        new CalcMake();
    }
}
