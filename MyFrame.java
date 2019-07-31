package com.exam;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		new MyFrame();
		setTitle("window title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		c.add(new JButton("plus"));
		c.add(new JButton("minus"));
		c.add(new JButton("multiple"));
		c.add(new JButton("divide"));
		c.add(new JButton("calculate"));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
