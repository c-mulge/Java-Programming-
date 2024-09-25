package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    public MyFrame(){

        button=new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("Click me");
//        button.addActionListener(e-> System.out.println("heyyyyyyy"));

        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("Hey, you pressed button");
        }
    }
}
