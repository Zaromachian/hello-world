package com.zaromachian.helloworld.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello World!");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setPreferredSize(new Dimension(600, 400));
		panel.setBackground(Color.black);
		
		frame.add(panel);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		JLabel label = new JLabel("Hello World!");
		label.setForeground(Color.green);
		label.setFont(new Font("Lucida Console", Font.BOLD, 36));
		
		panel.add(label);
	}

}
